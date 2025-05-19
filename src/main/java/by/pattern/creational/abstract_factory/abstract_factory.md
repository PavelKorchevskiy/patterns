**Abstract factory** should be used when you have a class with multiple factory methods.

Implementation:
1) Create interfaces for every object type (Photo, Pool, Post).
2) Create implementation for every object type (TelegramPhoto, TelegramPool, TelegramPost)
3) Create Factory interface with methods for creation of each object (MessageFactory).
4) Create implementations of Factory (TelegramMessageFactory, ViberMessageFactory).
5) 