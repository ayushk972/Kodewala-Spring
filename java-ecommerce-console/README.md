# Java E-Commerce Console Management System

Console-based e-commerce management system built with **Java 17**, **Maven**, **JUnit Jupiter 6**, and the **Java Collections Framework** (in-memory only).

## Prerequisites
- JDK 17
- Maven 3.8+

## Build & Test Commands
```bash
mvn -B clean compile
mvn -B clean verify
mvn -B test -DexcludedGroups=integration
mvn -B test -Dgroups=integration
```

## Package Structure
Base package: `com.flipkart`
- `app`: Entry point, manual dependency wiring (`ApplicationContext`), main menu
- `guest`, `customer`, `admin`: Role-based console menus
- `service` / `service.impl`: Business rules, validation, authorization, audit
- `repository` / `repository.impl`: In-memory stores (no delete methods)
- `model`: Entities, enums, records
- `exception`: Unchecked exception hierarchy
- `util`: Validators, hashers, ID generators, console I/O
- `seed`: Initial demo product catalog & admin credentials

## Known Limitations
- In-memory only (data is lost on exit)
- Console UI only (no database, JDBC, Spring, or web/REST APIs)
- Cash on delivery assumed; English letters only for Customer names

## Documentation Index
See [docs/README.md](docs/README.md).
