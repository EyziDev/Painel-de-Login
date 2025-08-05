# Painel de Login 1.2
🔒 O sistema permite que o usuário crie uma senha contendo letras e numeros, e faça login com até 3 tentativas. Caso o limite seja atingido, o programa encerra automaticamente, mantendo a segurança dos dados.

🎯 Funcionalidades que implementei:

Validação de senha agora com letras e números, antes(6 dígitos númericos e sem caracteres especiais).
Controle de tentativas de login com feedback direto para o usuário.
Menu interativo para criar a senha ou fazer login.

```mermaid
graph TD
    A[Início do programa] --> B[Exibir Menu: 1-Criar, 2-Login]
    
    N --> |1|
    B --> C[Digite nome de usuário]
    C --> D[Digite senha]
    D --> E{Confirmar senha}
    E -->|Senha correta| F[Usuário criado com sucesso]
    E -->|Senha errada 3 tentativas| G[Encerrar programa]
    E -->|Senha errada menos de 3 tentativas| D

    B --> H[Digite nome de usuário]
    H --> I[Digite senha]
    I --> J{Credenciais corretas?}
    J -->|Sim| K[Login bem-sucedido]
    J -->|Não| L[Mensagem de erro]

    F --> M[Voltar ao menu? S ou N]
    K --> M
    L --> M
    M -->|Sim| B
    M -->|Não| N[Fim do programa]