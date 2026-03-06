# EthioShop 🛒

[cite_start]**EthioShop** is an Ethiopian e-commerce marketplace with P2P capabilities, offline support, and modern features[cite: 1]. [cite_start]It provides a robust and seamless shopping experience utilizing state-of-the-art Flutter development practices and Material Design.

## ✨ Features

* [cite_start]**P2P Marketplace:** Seamlessly connect buyers and sellers[cite: 1].
* [cite_start]**Offline Support:** Robust offline caching and data persistence powered by Hive[cite: 2].
* [cite_start]**Real-time Backend:** Integrated with Firebase for Authentication, Cloud Firestore, Storage, Analytics, and Messaging[cite: 2].
* [cite_start]**Location Services:** Geo-aware features using Geolocator and Geocoding[cite: 3].
* [cite_start]**Robust Networking:** Enterprise-grade API client using Dio and Retrofit for type-safe HTTP requests[cite: 2].
* [cite_start]**Modern UI/UX:** Built with Flutter's Material Design capabilities [cite: 4][cite_start], utilizing custom Poppins typography [cite: 4, 5][cite_start], Shimmer loading effects, and smooth animations[cite: 2].

## 🛠 Tech Stack & Architecture

[cite_start]This application strictly adheres to modern Flutter architecture principles using the Flutter SDK (>=3.4.0 <4.0.0)[cite: 2]:

* [cite_start]**State Management:** Riverpod (with `riverpod_annotation` & code generation)[cite: 2].
* [cite_start]**Routing:** GoRouter for deep-linking and declarative routing[cite: 2].
* [cite_start]**Data Models:** Freezed and JSON Serializable for immutable states and safe JSON parsing[cite: 3].
* [cite_start]**Local Storage:** Hive & Hive Flutter[cite: 2].
* [cite_start]**Payments & Integrations:** WebView Flutter for local payment gateways (e.g., Chapa, Telebirr)[cite: 3].

## 🚀 Getting Started

### Prerequisites

* [cite_start]Flutter SDK `^3.4.0` [cite: 2]
* Dart SDK
* Firebase CLI (for backend services)

### Installation

1. Clone the repository:
   ```bash
   git clone [https://github.com/go-mark8/ethioshop.git](https://github.com/go-mark8/ethioshop.git)#
