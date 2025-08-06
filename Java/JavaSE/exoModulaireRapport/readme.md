### Étapes pour exécuter l'application

1. Compiler les modules :


Module BookAPI : 
```
javac -d out/BookAPI BookAPI/src/module-info.java BookAPI/src/maBibliotheque/Book.java
```

Module NotificationService :
```
javac -d out/NotificationService --module-path out NotificationService/src/module-info.java NotificationService/src/notification/NotificationService.java
```

Module Inventory :
```
javac -d out/Inventory --module-path out Inventory/src/module-info.java Inventory/src/inventaire/BookInventory.java
```

Module EmailNotification :
```
javac -d out/EmailNotification --module-path out EmailNotification/src/module-info.java EmailNotification/src/eNotification/EmailNotification.java
```

Module Checkout :
```
javac -d out/Checkout --module-path out Checkout/src/module-info.java Checkout/src/prets/CheckoutSystem.java
```

Module InventoryReport :
```
javac -d out/Reports --module-path out Reports/src/module-info.java Reports/src/report/InventoryReport.java
```

Module App :
```
javac -d out/App --module-path out App/src/module-info.java App/src/app/LibraryApp.java
```

2. Exécuter l'application principale :

```
java --module-path out -m LibraryApp/app.LibraryApp
```