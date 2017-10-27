# clientJava-centrifugo
Client em Java para o Centrifugo


Client in Java how to connect to the Centrifugal in protocol wss and ws.
Method of sending message to channel.
centrifugo.sendMessage (channel, "{\" content_1 \ ": value_1, \" content_2 \ ": 2}");
or
centrifugo.sendMessage (channel, data);

After connecting, use the
onNewDataMessage (final DataMessage message)
To monitor the channel.
Variables
userId: is the user id created in the centrifugal
userToken: is the centrifugal token
tokenTimestamp: is the timestamp in string of the moment the token was generated for the client
token: is the client access token.


Main class has an example.
