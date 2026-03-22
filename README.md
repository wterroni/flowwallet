# FlowWallet

🏗️ **Em Desenvolvimento** - Projeto Android simulando uma plataforma corporativa mobile com arquitetura moderna.

## 📋 Sobre o Projeto

FlowWallet é um projeto de estudo/exemplo demonstrando as melhores práticas de desenvolvimento Android moderno, com foco em:

- **Clean Architecture** e **MVI** (Model-View-Intent)
- **Kotlin Multiplatform (KMP) readiness** - estrutura preparada para multiplataforma
- **Jetpack Compose** para UI moderna
- **Dependency Injection** com Koin
- **Navigation Compose** para navegação type-safe

## 🏗️ Arquitetura

### Estrutura de Módulos
```
├── :platform:network          # Contrato de rede (Kotlin pure - KMP ready)
├── :app                       # Aplicação Android host
└── feature/transactions       # Feature de transações (domain/data/presentation)
```

### Clean Architecture por Feature
Cada feature segue a estrutura:
```
feature/
└── transactions/
    ├── domain/                # Lógica de negócio (Kotlin pure)
    │   ├── Transaction.kt
    │   ├── TransactionRepository.kt
    │   └── GetTransactions.kt
    ├── data/                  # Implementações de dados (Android)
    │   └── FakeTransactionRepository.kt
    └── presentation/          # UI com MVI + Compose
        ├── list/              # Lista de transações
        │   ├── TransactionsUiState.kt
        │   ├── TransactionsUiIntent.kt
        │   ├── TransactionsViewModel.kt
        │   ├── TransactionsListScreen.kt
        │   └── TransactionsListRoute.kt
        └── detail/            # Detalhe da transação
            ├── TransactionDetailUiState.kt
            ├── TransactionDetailUiIntent.kt
            ├── TransactionDetailViewModel.kt
            ├── TransactionDetailScreen.kt
            └── TransactionDetailRoute.kt
```

### MVI por Screen
- **UiState**: Estado imutável da UI
- **UiIntent**: Intents/actions do usuário
- **UiEffect**: Side-effects (navegação, etc)
- **ViewModel**: Orquestrador do MVI

## 🚀 Tecnologias

- **Kotlin**: Linguagem principal
- **Jetpack Compose**: UI declarativa
- **Navigation Compose**: Navegação type-safe
- **Koin**: Dependency Injection
- **Coroutines**: Programação assíncrona
- **Clean Architecture**: Separação de responsabilidades
- **MVI**: Pattern reativo para UI

## 📱 Funcionalidades Atuais

### ✅ Implementado
- **Dashboard**: Tela inicial com navegação
- **Transactions List**: Lista de transações com dados mock
- **Transaction Detail**: Tela de detalhe com navegação por ID
- **MVI Architecture**: Estado imutável e intents reativas
- **Navigation**: Fluxo completo Dashboard → List → Detail

### 🔄 Em Desenvolvimento
- Integração com API real
- Melhorias na UI/UX
- Testes unitários e de UI
- Tratamento de erros robusto

### 🎯 Futuro (KMP)
- Compartilhamento de domain/data layers
- Implementação iOS
- Web/Desktop support

## 🛠️ Setup

### Pré-requisitos
- Android Studio Hedgehog | 2023.1.1 ou superior
- JDK 11+
- Kotlin 2.0.21+

### Build
```bash
./gradlew build
```

### Run
```bash
./gradlew installDebug
```

## 📁 Estrutura KMP-Ready

O projeto está estruturado para facilitar migração para Kotlin Multiplatform:

### Layers Kotlin Pure (KMP-ready)
- `domain/`: Lógica de negócio sem dependências Android
- `platform/network/`: Contratos de rede compartilháveis

### Android-specific Layers
- `app/`: Host Android, DI, Navigation
- `data/`: Implementações Android (Fake, APIs, etc)

### Benefícios
- **Reuso**: Domain e Data podem ser compartilhados
- **Testabilidade**: Kotlin pure facilita testes
- **Performance**: Menos overhead por plataforma

## 🔄 Status do Projeto

**Atualmente**: 🚧 **Em Desenvolvimento Ativo**

- ✅ Arquitetura base implementada
- ✅ Fluxo de navegação funcional
- ✅ MVI pattern consistente
- ✅ KMP-ready structure
- 🔄 API integration (próximo)
- 🔄 UI enhancements (próximo)
- 🔄 Test coverage (próximo)

## 🤝 Contribuição

Este é um projeto de estudo/demonstração. Sinta-se à vontade para:

- Fork e experimentar
- Abrir issues com sugestões
- Enviar PRs com melhorias

## 📄 Licença

MIT License - ver arquivo [LICENSE](LICENSE) para detalhes.

---

**Nota**: Este projeto está em desenvolvimento ativo como parte de estudos de arquitetura Android moderna. A estrutura é deliberadamente minimalista para focar nos padrões arquiteturais.
