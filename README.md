# sistema-votacao-java  
Sistema em Java para cadastro, classificação e análise de votos por seção e candidato, utilizando arquivos `.txt`, vetores, geração aleatória e conceitos básicos de POO.

## 📋 Descrição  

Projeto desenvolvido em Java para simular um sistema de votação, onde são cadastrados votos aleatórios em diferentes seções eleitorais. O sistema permite ordenar, gravar e consultar os dados, oferecendo estatísticas detalhadas sobre os votos.

## 🎯 Objetivo  

Cadastrar 20 registros de votos gerados aleatoriamente, classificá-los por seção, salvar em arquivo e oferecer consultas sobre:
- Quantidade de eleitores por seção
- Seção com maior e menor número de eleitores
- Quantidade de votos por candidato
- Os 5 candidatos mais votados

## 🛠️ Funcionalidades  

- Cadastro automático de 20 votos com números aleatórios para seção (0–10) e candidato (0–300)  
- Classificação dos registros por número da seção  
- Gravação dos dados em arquivo `Votacao.txt`  
- Consultas via menu interativo  

## 🧱 Estrutura de Classes  

### 🔸 Classe `Vota`  

| Campo       | Tipo  | Descrição                  |
|-------------|-------|----------------------------|
| numsecao    | int   | Número da seção eleitoral  |
| numcand     | int   | Número do candidato        |

### 🔹 Classe `MenuVota`  
Classe principal com o método `main`, onde é exibido o menu principal e são chamadas as funções da lógica do sistema.

### 🔹 Classe `VotaFuncao`  

Contém os métodos:
- `cadvota()` – Gera os 20 registros aleatórios  
- `classifica()` – Ordena os registros por número de seção  
- `grava()` – Grava os registros no arquivo  
- `quant()` – Exibe quantidade de votos por seção  
- `mm()` – Mostra a seção com maior e menor número de votos  
- `votos()` – Mostra votos por candidato  
- `top()` – Mostra os 5 candidatos mais votados  

## 🗂️ Estrutura do Projeto  
```
sistema-votacao-java/
│
├── README.md
├── Votacao.txt ← Gerado durante execução
└── src/
├── Vota.java
├── MenuVota.java
└── VotaFuncao.java
```
## 💻 Tecnologias Utilizadas  

- Java  
- Programação orientada a objetos (POO) básica  
- Manipulação de arquivos `.txt`  
- Vetores e ordenação  
- Geração de números aleatórios (`Random`)  
- Interface gráfica com `JOptionPane`  
- IDE: NetBeans  

## ▶️ Como Executar  

1. Abra o projeto na sua IDE (ex: NetBeans)  
2. Compile os arquivos da pasta `/src`  
3. Execute a classe `MenuVota.java`  
4. Navegue pelo menu interativo:
```
SISTEMA DE VOTAÇÃO
1 – Carregar Seção/Número Eleitor
2 – Classificar por Seção
3 – Gravar Registros
4 – Mostrar Indicadores
9 – Finalizar
```
## 🏷️ Tags  

`java` `votação` `arquivo-txt` `poo` `vetores` `estatísticas` `ADS`
