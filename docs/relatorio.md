# Relatório do Projeto - Sistema de Gestão de Projetos

## 1. Objetivo
Criar um sistema para gerenciar projetos, tarefas, equipes e usuários, permitindo maior controle de prazos e eficiência no trabalho.

## 2. Arquitetura Utilizada
Foi utilizado o padrão de arquitetura **MVC (Model-View-Controller)**.

## 3. Paradigma POO
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

## 4. Diagrama UML (simplificado)
```mermaid
classDiagram
    class Usuario {
      -nome : String
      -cpf : String
      -email : String
      -cargo : String
      -login : String
      -senha : String
    }

    class Projeto {
      -nome : String
      -descricao : String
      -dataInicio : Date
      -dataFimPrevista : Date
      -status : String
    }

    class Equipe {
      -nome : String
      -descricao : String
    }

    Usuario <|-- Gerente
    Projeto "1" --> "1" Gerente
    Equipe "1" --> "*" Usuario
    Projeto "1" --> "*" Equipe
```

## 5. Impacto Humano
O **gerente de projetos** é o principal usuário final.

## 6. Conclusão
O sistema atende às necessidades propostas e pode ser expandido futuramente com interface gráfica e relatórios visuais.
