Greenhouse metrics - Change Data Capture(DEBEZIUM) DEMO 
-----
1. This is a Change Data Capture demo project build on following tech-stack:
   1. springboot-3
   2. java-21
   3. docker
   4. mongodb
   5. kafka
   6. debezium
   7. scheme-registry
 
## Running the full application

1. You can build the package as a single artifact by running the `./mvn clean install`.
 Start the docker containers by executing:
    path: ~/<project-root>/src/docker
    ```bash
    $ docker-compose up
    ```

2. Start java backend:
    ```bash
    $ java -jar backend/target/greenhouse-metrics-0.0.1-SNAPSHOT.jar
    ```
   The application will be accessible at `http://localhost:8080`.

3. run docker-compose up
   ```bash
   $ docker-compose up
   ```
4. Configure mongodb primary node
 
   4.1. Execute mongod.cfg file to set replica mode.
   ```bash
     $> mongod -f mongod.cfg
   ```
   4.2. Mongo db is set in replica mode with 2 nodes mongo1 and mongo2.
        One node is required to be set as primary.
      
         Set mongo1 as primary.
   ```bash
         $> docker exec -it mongo-1 mongosh --eval "rs.initiate({
                  _id: 'rs0',
                  members: [
                    {_id: 0, host: \"mongo-1\"},
                    {_id: 1, host: \"mongo-2\"}
                  ]
                })"

         $> docker exec -it mongo-1 mongosh --eval "rs.status()"
   ```           

5. Connect to mongodb db via compass using following connection string:
   ```bash
        $> mongodb://localhost:27017/?directConnection=true
   ```
6. Check Kafka topics:  
   ```bash
        $> docker exec -it kafka kafka-topics --bootstrap-server=localhost:9092 --list
   ```
   

