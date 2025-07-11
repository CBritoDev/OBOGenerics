# Requisitos do Projeto OBO Generics 

## Requisitos Funcionais (versão inicial com banco de dados)

1. O sistema deve possibilitar o cadastro de clientes (pessoas físicas), armazenando os dados em banco de dados.
2. O sistema deve permitir o cadastro da pessoa jurídica (oficina que usará o sistema), com dados persistidos no banco.
3. O sistema deve adaptar-se às configurações da pessoa jurídica cadastrada.
4. O sistema deve permitir o cadastro de novos veículos, associados aos clientes, armazenando no banco.
5. O sistema deve permitir a alteração dos dados de clientes, veículos e orçamentos, persistindo as alterações no banco.
6. O sistema deve permitir a exportação dos orçamentos em arquivos TXT simples.
7. O sistema deve permitir a exclusão completa dos dados de um cliente no banco de dados.
8. O sistema deve ter uma tela de login simples para a pessoa jurídica cadastrada, com dados verificados no banco.
9. No primeiro acesso, o sistema deve solicitar login ou cadastro da pessoa jurídica.
10. O sistema deve ter telas com tamanho fixo e padrão para todas as etapas.

## Requisitos Não Funcionais (versão inicial com banco de dados)

- O sistema deve usar banco de dados MYSQL para persistência dos dados.
- O sistema deve ter uma interface gráfica simples e consistente usando Java Swing.
- O sistema deve responder às ações do usuário em tempo aceitável para aplicações desktop.
- O sistema deve garantir que as conexões com banco sejam abertas e fechadas corretamente para evitar problemas.
- O sistema deve permitir fácil manutenção e extensão futura.

## Requisitos planejados para versões futuras

- Implementar criptografia para senha do login.
- Permitir exportação de orçamentos em formatos avançados (Word, PDF).
- Implementar autenticação mais segura e controle de acesso.
- Melhorar usabilidade e layout das telas com frameworks gráficos mais avançados.
- Possibilitar a integração com sistemas externos (ex: sistemas financeiros).
