<h1>Kafka Basics</h1>
<img src="Image001.jpg">
<img src="Image002.jpg">
<img src="Image003.jpg">
<h1> Programing In Kafka using Java </h1>
Followed this tutorial to set up basic intellij to use kafka and maven. </br>
https://www.javatpoint.com/creating-kafka-producer-in-java </br>

</br>

Use this tutorial to start zookeeper and kafka broker. </br>
https://www.youtube.com/watch?v=6AYNxdKQ_0o&list=PLkz1SCf5iB4enAR00Z46JwY9GGkaS2NON&index=6 </br>

</br>

To start zookeeper go inside your installed kafka folder and then type this command </br>
bin/zookeeper-server-start.sh config/zookeeper.properties  </br>
Default port 2181 </br>

</br>

To start kafka broker, again go inside your installed kafka folder and type the following command </br>
bin/kafka-server-start.sh config/server.properties </br>
Default Port 9092 </br>

</br>

To create a new kafka topic </br>
bin/kafka-topics.sh --zookeeper localhost:<b>[Port number your zookeeper is running on, by default it is 2181]</b> --create --topic <b>[Topic Name]</b> --partitions 2 --replication-factor 1 </br>

</br>

To start producer </br>
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic <b>[Topic Name]</b> </br>

</br>

To start consumer </br>
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic <b>[Topic Name]</b> </br>

</br>

Now go to this tutorial and create a java program </br>
https://www.youtube.com/watch?v=bwXWIx5dZjw&t=938s </br>

</br>
