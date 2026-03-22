# FlowWallet

🏗️ **Under Development** - Android project simulating a corporate mobile platform with modern architecture.

## 📋 About

FlowWallet is a study/example project demonstrating modern Android development best practices, focusing on:

- **Clean Architecture** and **MVI** (Model-View-Intent)
- **Kotlin Multiplatform (KMP) readiness** - structure prepared for cross-platform
- **Jetpack Compose** for modern UI
- **Dependency Injection** with Koin
- **Navigation Compose** for type-safe navigation

## 🏗️ Architecture

### Module Structure
```
├── :platform:network          # Network contract (Kotlin pure - KMP ready)
├── :app                       # Android host application
└── feature/transactions       # Transactions feature (domain/data/presentation)
```

### Clean Architecture per Feature
Each feature follows the structure:
```
feature/
└── transactions/
    ├── domain/                # Business logic (Kotlin pure)
    │   ├── Transaction.kt
    │   ├── TransactionRepository.kt
    │   └── GetTransactions.kt
    ├── data/                  # Data implementations (Android)
    │   └── FakeTransactionRepository.kt
    └── presentation/          # UI with MVI + Compose
        ├── list/              # Transactions list
        │   ├── TransactionsUiState.kt
        │   ├── TransactionsUiIntent.kt
        │   ├── TransactionsViewModel.kt
        │   ├── TransactionsListScreen.kt
        │   └── TransactionsListRoute.kt
        └── detail/            # Transaction detail
            ├── TransactionDetailUiState.kt
            ├── TransactionDetailUiIntent.kt
            ├── TransactionDetailViewModel.kt
            ├── TransactionDetailScreen.kt
            └── TransactionDetailRoute.kt
```

### MVI per Screen
- **UiState**: Immutable UI state
- **UiIntent**: User actions/intents
- **UiEffect**: Side effects (navigation, etc)
- **ViewModel**: MVI orchestrator

## 🚀 Technologies

- **Kotlin**: Primary language
- **Jetpack Compose**: Declarative UI
- **Navigation Compose**: Type-safe navigation
- **Koin**: Dependency Injection
- **Coroutines**: Asynchronous programming
- **Clean Architecture**: Separation of concerns
- **MVI**: Reactive UI pattern

## 📱 Current Features

### ✅ Implemented
- **Dashboard**: Home screen with navigation
- **Transactions List**: Transaction list with mock data
- **Transaction Detail**: Detail screen with ID navigation
- **MVI Architecture**: Immutable state and reactive intents
- **Navigation**: Complete Dashboard → List → Detail flow

### 🔄 In Development
- Real API integration
- UI/UX improvements
- Unit and UI tests
- Robust error handling

### 🎯 Future (KMP)
- Domain/Data layers sharing
- iOS implementation
- Web/Desktop support

## 🛠️ Setup

### Prerequisites
- Android Studio Hedgehog | 2023.1.1 or higher
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

## 📁 KMP-Ready Structure

The project is structured to facilitate Kotlin Multiplatform migration:

### Kotlin Pure Layers (KMP-ready)
- `domain/`: Business logic without Android dependencies
- `platform/network/`: Shareable network contracts

### Android-specific Layers
- `app/`: Android host, DI, Navigation
- `data/`: Android implementations (Fake, APIs, etc)

### Benefits
- **Reuse**: Domain and Data can be shared
- **Testability**: Kotlin pure facilitates testing
- **Performance**: Less platform overhead

## 🔄 Project Status

**Currently**: 🚧 **Active Development**

- ✅ Base architecture implemented
- ✅ Navigation flow functional
- ✅ Consistent MVI pattern
- ✅ KMP-ready structure
- 🔄 API integration (next)
- 🔄 UI enhancements (next)
- 🔄 Test coverage (next)

## 🤝 Contributing

This is a study/demonstration project. Feel free to:

- Fork and experiment
- Open issues with suggestions
- Send PRs with improvements

## 📄 License

MIT License - see [LICENSE](LICENSE) file for details.

---

**Note**: This project is under active development as part of modern Android architecture studies. The structure is intentionally minimalistic to focus on architectural patterns.
