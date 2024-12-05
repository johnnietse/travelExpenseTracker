# travelExpenseTracker

**travelExpenseTracker** is an Android app specifically designed for the **Queen's Student Cluster Competition Team** to efficiently track their travel expenses and incomes while participating in **SC24** ([sc24.supercomputing.org](https://sc24.supercomputing.org)) and **SC25**. The app allows users to log transactions and visualize financial data with charts. While the app provides a comprehensive list of recorded transactions, users must manually transfer these records into Excel spreadsheets to generate financial statements.

## Purpose of building this app
As the **Financial Lead** for the team, I wanted to create a tool that would simplify financial tracking for everyone involved and help me manage the team's finances more effectively. This app allows me to track each competition member's expenses and incomes during their travels. When they return, I use the recorded list of transactions to review and organize the team's budget, ensuring everything aligns with our financial goals. While the app doesn't directly generate Excel spreadsheets, it provides all the necessary details to manually create financial statements based on the recorded data.

This project reflects my dedication to keeping our team organized and financially prepared, so we can focus on achieving success at the competitions.

## Features

- **Secure Login**: 
  - Login with username and password.
  - Authentication managed using `LoginRepository` and `LoginDataSource` with SQLite database.
  - Built using Android Studio's Login Activity.

- **Home Screen**: 
  - Displays a list of recorded income and expenses with filtering options.
  - Add new transactions with details like date, notes, and categories.

- **Statistics Page**: 
  - Visualize financial insights with:
    - **PieChart**: Displays expense distribution by category.
    - **Grouped BarChart**: Compares income and expenses over time.

- **Settings Page**: 
  - Change the app’s currency.
 
- **Manual Export**: 
  - Use the transaction list on the Home Screen to manually transfer records into Excel spreadsheets.

## App Screens and Functionalities

### Login
- Built using Android Studio's Login Activity.
- User credentials are securely managed via SQLite-based `LoginRepository` and `LoginDataSource`.
- Configured as the main activity in `AndroidManifest.xml`.

### Home Screen
- Displays a transaction list with filtering options.
- Add transactions with:
  - **Type**: Income or Expense.
  - **Category**: Customizable (e.g., Travel, Food, Accommodation).
  - **Date**: Custom date selection.
  - **Notes**: Add additional details.

### Statistics Page
- Visual insights using:
  - **PieChart**: Proportional expense distribution.
  - **Grouped BarChart**: Income vs. expense comparison.

### Settings Page
- Adjust app currency preferences.

## Tools and Technologies
- **Programming Language**: Java/Kotlin
- **IDE**: Android Studio
- **Database**: SQLite
- **Charting Library**: [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)

## How to Use
1. Log in with your username and password.
2. Record your income and expenses on the Home Screen.
3. View insights and trends on the Statistics Page.
4. Adjust app settings, including currency preferences, on the Settings Page.
5. Manually transfer transaction records into an Excel spreadsheet.

## Future Enhancements
- Multi-language support.
- Direct Excel export functionality.
- Cloud backup for data synchronization across devices.
- Advanced filtering options and custom reporting formats.

---

Feel free to contribute or suggest improvements by submitting an issue or pull request!


---

## Screenshots of the app
| Login or Register Page       | Adding Income or Expense Page      | Home Page      |
|----------------|----------------|----------------|
![Screenshot (1)](https://github.com/user-attachments/assets/dd403aed-4882-486d-8da2-f95cf32678c7) | ![Screenshot (2)](https://github.com/user-attachments/assets/9c631cd4-e88f-4642-9e46-badc9a6784ac) | ![Screenshot (3)](https://github.com/user-attachments/assets/c3523e9b-7c2d-46cc-ad70-9b845a5e351e)

| Statistics Page Part 1       | Statistics Page Part 2      | Date Selection Calendar Page      |
|----------------|----------------|----------------|
![Screenshot (4)](https://github.com/user-attachments/assets/50af9ea4-3246-467a-83f1-abf8bae3710a) | ![Screenshot (5)](https://github.com/user-attachments/assets/86e527b2-2483-48bd-8d8e-0a4df560bf5c) | ![Screenshot (6)](https://github.com/user-attachments/assets/36907229-52aa-4cf8-beb4-b1c7e6141bca)

| Date Selection Page (through typing)       | Date Selection Page (through taping the date ranges on the calendar)     | Settings Page Part 1      |
|----------------|----------------|----------------|
![Screenshot (7)](https://github.com/user-attachments/assets/ba4eb00d-6572-45a7-902a-5424fdafadad) | ![Screenshot (8)](https://github.com/user-attachments/assets/b976479a-e9a9-4563-a4a9-88ab59db5a68) | ![Screenshot (9)](https://github.com/user-attachments/assets/4619b53f-4f19-4035-ae1b-f11a5f126f88)

| Settings Page Part 2| 
|----------------|
![Screenshot (10)](https://github.com/user-attachments/assets/9b094578-ae66-4adf-8c47-700ea021198a)|


