# Sistema de Gestão de Projetos

Este projeto foi desenvolvido para demonstrar o uso da Programação Orientada a Objetos (POO) e o padrão de arquitetura MVC em Java, integrado a um banco de dados Oracle (ainda não conectado, simulado por DAOs em memória nesta versão).

## 👤 Autor
Vinicius Ferreira

## 🎯 Objetivo
O sistema tem como finalidade gerenciar:
- Usuários (administrador, gerente, colaborador)
- Projetos (cadastro, prazos, status)
- Equipes (membros e alocação em projetos)
- Relatórios de acompanhamento

## ⚙️ Tecnologias
- Java 17
- Gradle
- Banco de Dados Oracle (planejado para integração futura)
- Arquitetura MVC
- JUnit 4 para testes unitários

## 🚀 Como executar

### Pré-requisitos
- Java 17 instalado e configurado no PATH  
- Gradle instalado ou use o wrapper `./gradlew` no Linux/Mac ou `gradlew.bat` no Windows  

### Passos para rodar

1. Clone o repositório:

```bash
git clone https://github.com/vinicius17ferreira-source/sistema-gestao-projetos.git
cd sistema-gestao-projetos
gradle run
