# AMG Automóveis

Este projeto é uma aplicação Java com Spring que simula o funcionamento de uma concessionária de automóveis. Ele oferece endpoints para realizar operações básicas de CRUD (Create, Read, Update, Delete) em relação aos veículos disponíveis na concessionária.

## Equipe

- **Adriel Ryan**
- **Matheus Alves**
- **Thulio**

## Funcionalidades

O projeto possui os seguintes endpoints:

- `GET /carros`: Retorna a lista de todos os veículos disponíveis na concessionária.
- `GET /carros/{id}`: Retorna as informações de um veículo específico, com base no ID fornecido.
- `POST /carros`: Adiciona um novo veículo à concessionária.
- `PUT /carros/{id}`: Atualiza as informações de um veículo existente, com base no ID fornecido.
- `DELETE /carros/{id}`: Remove um veículo da concessionária, com base no ID fornecido.

## Tratativas de Exceções

Foram implementadas tratativas de exceções utilizando blocos try-catch para lidar com situações inesperadas durante a execução da aplicação.

## Como usar

1. Clone este repositório: `git clone https://github.com/seu-usuario/amg-automoveis.git`
2. Navegue até o diretório do projeto: `cd amg-automoveis`
3. Compile o projeto: `mvn compile`
4. Execute o projeto: `mvn spring-boot:run`

Certifique-se de ter o Maven e o Java instalados em sua máquina antes de executar o projeto.

## Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.
