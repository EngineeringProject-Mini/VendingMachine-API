# VendingMachine API

This is a simple ATM backend application built using Spring Boot.

It provides basic REST APIs for ATM operations like deposit, withdrawal, and balance check.

---

## 🚀 Getting Started

### 1. Generate Project with Spring Initializr

1. Go to [Spring Initializr](https://start.spring.io/).
2. Fill in the details:
    - Project: Maven
    - Language: Java
    - Spring Boot Version: (latest stable, e.g., 3.x.x)
    - Group: vendingmachine
    - Artifact:
    - Name: vendingmachine
    - Packaging: Jar
    - Java: 17 (or your installed version)
3. Add dependencies:
    - Spring Web
    - 
        - Lombok
4. Click Generate, and extract the downloaded project.

---

### 2. Open in IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Import the project by selecting the extracted folder.
3. Wait until Maven builds the project and dependencies are downloaded.

---

### 3. Run the Application

1. Locate the main class:
src/main/java/vendingmachine.java
2. Right-click and select Run 'Application'.
3. The application will start on [http://localhost:8080](http://localhost:8080/) by default.
---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Maven
- REST API



---

# 🥤 Vending Machine API – Endpoints

This controller provides endpoints to **manage items, insert coins, select products, and dispense/refund items** in a vending machine.

---

## ✅ API Endpoints

### 1. Add Item

**Request:**

```
POST /api/vending/add-item?code=A1&name=Coke&price=50&quantity=10
```

**Description:** Adds a new item (with code, name, price, and quantity) to the vending machine inventory.
<img width="1366" height="768" alt="Screenshot (409)" src="https://github.com/user-attachments/assets/d763ef1f-85a5-46df-8a92-c9163c13b808" />

---

### 2. Select Item

**Request:**

```
POST /api/vending/select-item?code=A1
```

**Description:** Selects an item from the machine for purchase using its item code.
<img width="1366" height="768" alt="Screenshot (410)" src="https://github.com/user-attachments/assets/91ff6310-f3d1-4a2e-88e0-3087ce286531" />

---

### 3. Insert Coin

**Request:**

```
POST /api/vending/insert-coin?coin=QUARTER
```

**Description:** Inserts a coin into the machine. Updates the balance accordingly.

* Example coin types: `PENNY`, `NICKEL`, `DIME`, `QUARTER` (depends on `Coin` enum).
<img width="1366" height="768" alt="Screenshot (411)" src="https://github.com/user-attachments/assets/6af8e59a-85db-4271-b533-6cee9f3bff42" />

---

### 4. Dispense Item

**Request:**

```
POST /api/vending/dispense
```

**Description:** Dispenses the selected item (if balance is sufficient).

---

### 5. Refund Balance

**Request:**

```
POST /api/vending/refund
```

**Description:** Refunds the current balance back to the user.
<img width="1366" height="768" alt="Screenshot (413)" src="https://github.com/user-attachments/assets/b5f77d8f-054e-4eb8-8e00-afb9f13e1240" />

---


