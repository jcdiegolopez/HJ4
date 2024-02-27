Diego López 23242
Mario Rocha 23501

HOJA DE TRABAJO 4

- Calcudora INFIX a traves de diferentes implementaciones de stacks y tipos de listas. 
- Se hizo uso de Singleton Y Factory para la creación de la calculadora y los tipos de stack y lista.
- ¿Cree el uso de Singleton es adecuado en este programa?
  - El uso de Singleton nos parece el adecuado en este caso, siempre y cuando exista una clara necesidad de tener una única instancia global de la clase Calculadora para la evaluación de expresiones infix y se haya considerado la posibilidad de concurrencia de manera segura en la implementación del Singleton. Esto puede simplificar el acceso y la gestión de la instancia de la Calculadora en todo el programa. Como en el programa solo hay un cliente, el mantener una unica instancia es una buena práctica, sin embargo no es necesaria, la falta del uso del singleton no afectaría la funcionalidad del programa.
