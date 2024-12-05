# travelExpenseTracker

**travelExpenseTracker** is an Android app designed for competition team members to efficiently track their travel expenses and incomes. The app allows users to log transactions, visualize financial data with charts, and export records into Excel spreadsheets to create financial statements.

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

- **Export to Excel**: 
  - Export transaction records to Excel spreadsheets for reporting and analysis.

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

### Export Feature
- Export financial data to an Excel spreadsheet for easy reporting.

## Tools and Technologies
- **Programming Language**: Java/Kotlin
- **IDE**: Android Studio
- **Database**: SQLite
- **Charting Library**: [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)
- **Excel Export**: Apache POI or a similar library.

## How to Use
1. Log in with your username and password.
2. Record your income and expenses on the Home Screen.
3. View insights and trends on the Statistics Page.
4. Adjust app settings, including currency preferences, on the Settings Page.
5. Export your data as an Excel spreadsheet for reporting.

## Future Enhancements
- Multi-language support.
- Cloud backup for data synchronization across devices.
- Advanced filtering options and custom reporting formats.

---

Feel free to contribute or suggest improvements by submitting an issue or pull request!
