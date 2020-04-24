from kafka import KafkaProducer
from json import dumps

topic = "NumberTopic"

# Initialize new kafka producer
producer = KafkaProducer(
    bootstrap_servers=['localhost:9092'],
    value_serializer=lambda x: dumps(x).encode('utf-8')
    )

# Send Messages
message = {'number' : 10}
producer.send(topic, value=message)

print "Sent message"
