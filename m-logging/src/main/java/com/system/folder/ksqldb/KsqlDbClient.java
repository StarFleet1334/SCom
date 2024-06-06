package com.system.folder.ksqldb;


import io.confluent.ksql.api.client.Client;
import io.confluent.ksql.api.client.ClientOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;


@Service
public class KsqlDbClient {

    private static final Logger LOG = LoggerFactory.getLogger(KsqlDbClient.class);

    private static final ClientOptions CLIENT_OPTIONS = ClientOptions.create().setHost("localhost").setPort(8088);

    public void createStream() throws InterruptedException, ExecutionException {
        var client = Client.create(CLIENT_OPTIONS);

        var statement = "DROP STREAM IF EXISTS `t-user-action` DELETE TOPIC;";

        var result = client.executeStatement(statement).get();

        LOG.info(result.toString());

        statement = """
				CREATE OR REPLACE STREAM `t-user-action` (
				  `email` VARCHAR,
				  `timestamp` TIMESTAMP,
				  `action` VARCHAR
				) WITH (
				  KAFKA_TOPIC = 't-user',
				  VALUE_FORMAT = 'JSON'
				);
				""";

        result = client.executeStatement(statement).get();

        LOG.info("I am here");
        LOG.info(result.toString());
        LOG.info("After I am also here");
    }

}
