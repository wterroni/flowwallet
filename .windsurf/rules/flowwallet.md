---
trigger: manual
description: 
globs: 
---

Project Context – FlowWallet

This project is Android-first, but must be designed to become KMP + CMP in the future.

Core principles:
- Android is the primary target now.
- All core, domain, mvi and common layers must remain Kotlin-only and KMP-ready.
- Android-only APIs (Navigation Compose, LocalContext, resources, etc.) must stay in app or platform-specific layers.
- Navigation must be isolated: routes and navigation contracts in core, implementations in app.
- Architecture follows Clean Architecture + MVI.
- UI must be stateless, driven only by UiState and UiIntent.
- Avoid overengineering, but never violate architectural boundaries.

Platform mindset:
- platform/* packages represent internal platform SDKs (network, persistence, security, observability, push, webview).
- These SDKs are Android-only for now, but must expose clean Kotlin contracts to allow future KMP migration.
- Treat the project as a monorepo simulating a real Mobile Platform team.

KMP / CMP readiness:
- Prefer Kotlin-first abstractions.
- Do not introduce AndroidX dependencies into core or domain.
- Every decision should consider future KMP + Compose Multiplatform migration.
