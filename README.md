Sistema de Reservas de Vuelo con Prioridad y RabbitMQ
Este proyecto implementa un sistema de reservas de vuelo utilizando Spring Boot, MySQL y RabbitMQ, con estructuras de datos personalizadas para manejar la prioridad de atención.

Funcionalidades principales
Crear, actualizar, eliminar y listar reservas a través de una API REST.

Al crear o actualizar una reserva, se envía a RabbitMQ para su procesamiento asincrónico.

Las reservas también se almacenan en una cola de prioridad personalizada, priorizando a los pasajeros según su nivel de urgencia.

Un consumidor RabbitMQ simula el procesamiento de las reservas y muestra mensajes en consola.

Arquitectura del sistema
ReservaController: Expone los endpoints REST.

ReservaService: Contiene la lógica de negocio para gestionar las reservas y su prioridad.

ReservaProducer: Envía mensajes con reservas al exchange de RabbitMQ.

ReservaConsumer: Recibe y procesa las reservas desde la cola RabbitMQ.

MiColaPrioridad: Implementa una estructura de datos que ordena las reservas por prioridad.

RabbitMQConfig: Configura la cola, exchange, binding y conversores de mensajes.

Base de datos MySQL: Almacena las reservas de manera persistente.
