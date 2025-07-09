# sistema-votacao-java
Sistema em Java para cadastro, classificação e análise de votos por seção e candidato, utilizando arquivos .txt e conceitos de POO.

# Sistema de Votação em Java

Projeto desenvolvido em Java para simular um sistema de votação, onde são cadastrados votos em diferentes seções eleitorais. O sistema permite ordenar, gravar e consultar os dados, oferecendo estatísticas detalhadas sobre a votação.

## 🎯 Objetivo

Cadastrar 200 registros de votos gerados aleatoriamente, classificá-los, salvar em arquivo e oferecer consultas sobre quantidade de eleitores por seção, votos por candidato e os 10 candidatos mais votados.

## 🛠️ Funcionalidades

- Cadastro automático de 200 registros com votos, usando números aleatórios para Seção e Candidato
- Classificação dos registros por número da seção
- Gravação dos dados em arquivo `Votacao2021.txt`
- Consultas via menu:
  - Quantidade de eleitores por seção
  - Seção com maior e menor número de eleitores
  - Quantidade de votos por candidato
  - Exibição dos 10 candidatos mais votados

## 🧱 Estrutura de Classes

### 🔸 Classe Abstrata: `Votacao`

| Campo           | Tipo  | Descrição                      |
|-----------------|-------|--------------------------------|
| numeroSecao     | `int` | Número da seção eleitoral       |
| numeroCandidato | `int` | Número do candidato             |

### 🔹 Classe `Votacao2021`

Contém os métodos principais do sistema:

- `fCadastraVotacao()` – Gera e cadastra 200 registros aleatórios
- `fClassificaSecao()` – Classifica os registros por número de seção
- `fGravaVotacao()` – Grava os registros em arquivo
- Menu com procedimentos para consultar os dados estatísticos

## 🗂️ Estrutura do Projeto

sistema-votacao-java/
│
├── README.md
├── Votacao2021.txt ← Gerado durante execução
└── src/
├── Votacao.java
└── Votacao2021.java


## 💻 Tecnologias Utilizadas

- Java
- Orientação a objetos
- Manipulação de arquivos `.txt`
- Métodos de ordenação e geração aleatória
- IDE: Eclipse, IntelliJ ou NetBeans

## ▶️ Como Executar

1. Compile os arquivos da pasta `/src`
2. Execute a classe `Votacao2021.java`
3. Navegue pelo menu para interagir com o sistema:

SISTEMA DE VOTAÇÃO
1 – Carregar Seção/Número Eleitor
2 – Classificar por Seção
3 – Gravar Registros
4 – Mostrar Indicadores
9 – Finalizar


## 🏷️ Tags

`java` `votação` `arquivo-txt` `poo` `aleatório` `estatísticas` `ADS`

