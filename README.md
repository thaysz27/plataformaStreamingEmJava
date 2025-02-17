Plataforma de Streaming em Java

Este projeto é uma aplicação Java que simula uma plataforma de streaming, permitindo a gestão de filmes, séries e episódios. Foi desenvolvido durante a formação "Aprenda a programar em Java com Orientação a Objetos" da Alura.

📌 Funcionalidades

Cálculo do tempo total de exibição.

Filtros de recomendação baseados em critérios específicos.

Busca de títulos com tratamento de erros.

📂 Estrutura do Projeto

O projeto está organizado de forma modular para facilitar a manutenção e expansão. O código-fonte está localizado na pasta src, dividido em pacotes específicos de acordo com a responsabilidade de cada conjunto de classes. O pacote calculos contém classes responsáveis por cálculos e recomendações, enquanto o pacote excecao trata erros específicos que podem ocorrer na execução da aplicação. No pacote modelos, encontram-se as classes que representam os principais objetos do sistema, como Filme, Serie e Episodio. Já o pacote principal contém as classes responsáveis pela execução da aplicação, incluindo diferentes pontos de entrada para testar funcionalidades distintas.

Além do código-fonte, o projeto inclui um arquivo filmes.txt, que serve como base de dados para testes, e um arquivo .gitignore, que define quais arquivos devem ser ignorados pelo Git. Há também um arquivo de configuração do projeto (Plataforma Streaming em Java.iml), útil para usuários que desejam abrir o projeto diretamente em uma IDE compatível.

🚀 Como Executar

Clone o repositório:

git clone https://github.com/seu-usuario/plataforma-streaming-java.git

Abra o projeto em uma IDE como IntelliJ IDEA ou Eclipse.

Compile e execute a classe Main.java ou PrincipalComBusca.java.

🛠 Tecnologias Utilizadas

Java 17

Maven (se aplicável)

📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
