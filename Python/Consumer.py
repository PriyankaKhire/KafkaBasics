from kafka import KafkaConsumer
from json import loads

topic = "NumberTopic"

# Initialize new kafka consumer
consumer = KafkaConsumer(
    bootstrap_servers=['localhost:9092'],
    value_deserializer=lambda x: loads(x.decode('utf-8')),
    group_id='my-group'
    )

# Consume topic messages
consumer.subscribe(topic)

# Recieve messages
for m in consumer:
    print m.value

# Refer https://kafka-python.readthedocs.io/en/master/usage.html
# for more details
