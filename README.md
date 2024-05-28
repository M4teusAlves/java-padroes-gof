# Padrão Decorator: PetShop

O padrão Decorator é um padrão de design estrutural que permite adicionar comportamentos a objetos individuais de forma dinâmica e transparente, sem afetar outros objetos da mesma classe. Neste exemplo, vamos explorar como o padrão Decorator pode ser aplicado em um sistema de PetShop em Java.

## Estrutura do Projeto

O projeto é composto pelos seguintes elementos:

- `PetService`: Interface que define o serviço básico oferecido pelo PetShop.
- `BasicService`: Implementação concreta da interface `PetService`, representando o serviço básico oferecido pelo PetShop.
- `PetServiceDecorator`: Classe abstrata que estende `PetService` e atua como a base para os decoradores.
- `GroomingDecorator` e `TrainingDecorator`: Decoradores concretos que estendem `PetServiceDecorator` e adicionam funcionalidades específicas de grooming (higiene) e treinamento, respectivamente.

## Uso do Padrão Decorator

O padrão Decorator é útil quando queremos adicionar funcionalidades extras a objetos existentes sem modificar sua estrutura. No contexto do PetShop, isso pode ser aplicado da seguinte forma:

1. **Criando um serviço básico**: Começamos definindo a interface `PetService` e sua implementação básica `BasicService`, que oferece os serviços essenciais do PetShop.

2. **Criando decoradores**: Em seguida, definimos a classe abstrata `PetServiceDecorator`, que estende `PetService`, e os decoradores concretos `GroomingDecorator` e `TrainingDecorator`, que adicionam funcionalidades de grooming e treinamento, respectivamente.

3. **Compondo serviços**: Podemos compor diferentes serviços usando os decoradores. Por exemplo, podemos ter um serviço que combina o serviço básico com serviços de grooming e treinamento adicionais.

4. **Chamando os serviços**: Os clientes do PetShop podem solicitar serviços diretamente do `PetService` básico ou de qualquer combinação de decoradores adicionados.

## Exemplo de Uso

```java
// Criando um serviço básico
PetService service = new BasicService(); // Criando Serviço básico

// Adicionando serviços de grooming e treinamento
PetService serviceWithGrooming = new GroomingDecorator(service); // Adicionando tosa ao serviço
PetService serviceWithTraining = new TrainingDecorator(service); // Adicionando treinamento ao serviço
```

# UML

![UML - Decorator - GoF](https://raw.githubusercontent.com/M4teusAlves/java-padroes-gof/main/decorator/UML/UML%20-%20Decorator%20-%20GoF.png)
