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

3. Configure mongodb primary node

   Mongo db is set in replica mode with 2 nodes mongo1 and mongo2.
   
   One node is required to be set as primary.
   
   Set mongo1 as primary.
      ```bash
       #login to container console
       $docker exec -it mongo1 bash
      
       #login to mongo shell
       $bash> mongosh
       $bash> rs.initiate({_id: "rs0", members: [{ _id : 0, host: "mongo1:27017" },{ _id : 1, host: "mongo2:27018" }] })
      
       #check status         
       $bash> rs.status()
       ```



