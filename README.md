1. Android Studio and Hello World
   Install Android Studio, the Android development environment and create your first Android app, Hello World,
   on an emulator and on a physical device.
2. Your first interactive UI
   Create an app and add two Button elements and a TextView to the layout. Implement click-handler methods
   to display messages on the screen when the user taps each Button.
3. Text and scrolling views
   Create the ScrollingText app in which Add two TextView elements for the article heading and content detail.
   Add a ScrollView to the layout to scroll content vertically to read by swiping up and down in case of content
   not fit on screen.
4. Activities and intents
   Create an Android app with a main Activity and a second Activity. Pass some data (a string) from the main
   Activity to the second using an Intent, and display that data in the second Activity. Send a second different
   bit of data back to the main Activity, also using an Intent.
5. Implicit intents
   Create an Android app to Implement an implicit Intent that opens a web page, and another that opens a location
   on a map. Also, Implement an action to share a snippet of text.
6. The debugger & Unit tests
   Create an Addroid app SimpleCalc to demonstrate the simple calculator operations. For debugging use
   Examine variables and evaluate expressions to Identify and fix problem. Add and run unit tests to see the
   results to the SimpleCalc app.
7. Clickable images
   Create a mock dessert-ordering app that uses images as interactive elements. Set onClick() handlers for the
   images to display different Toast messages. Change the floating action button supplied by the template so that
   it shows a different icon and launches another Activity.
8. Input controls
   In this practical, you use attributes to control the on-screen keyboard appearance, and to set the type of data
   entry for an EditText. You also add radio buttons to the DroidCafe app so the user can select one item from a
   set of items.
    Show a keyboard for entering an email address.
    Show a numeric keypad for entering phone numbers.
    Allow multiple-line text entry with automatic sentence capitalization.
    Add radio buttons for selecting an option.
    Set an onClick handler for the radio buttons.
    Add a spinner for the phone number field for selecting one value from a set of values.
9. Menus and pickers & User navigation
   Continue adding features to the Droid Cafe project from the previous practical.
    Add menu items to the options menu.
    Add icons for menu items to appear in the app bar.
    Connect menu-item clicks to event handlers that process the click events.
    Use an alert dialog to request a user's choice.
    Use a date picker for date input.
    Provide the Up button in the app bar to navigate up to the parent Activity.
    Create a new app with tabs for navigating Activity screens that can also be swiped.
10. RecyclerView
    Create a new app that uses a RecyclerView to display a list of items as a scrollable list and associate click
    behavior with the list items. Use a FAB to let the user add items to the RecyclerView.
11. Drawables, styles, and themes
    Create an app and add Button and TextView elements to the layout. Create Drawable resources in XML and
    use them as backgrounds for your Button elements. Apply styles to UI elements. Add a menu item that changes
    the theme of the app to a low contrast "night mode."
12. AsyncTask and AsyncTaskLoader & Broadcast receivers
    Create the "Who Wrote It?" app, which queries the Books API using a worker thread and displays the result
    in the UI. Use the Google Books API to retrieve data over the internet and keep the UI fast and responsive.
    Create a simple app that executes a background task using an AsyncTask. Implement activity instance state
    to retain the state of a TextView message when you rotate the device. Modify the "Who Wrote it?" app to use
    an AsyncTaskLoader instead of an AsyncTask. Subclass a BroadcastReceiver to show a toast when a
    broadcast is received.
13. Notifications, The alarm manager & JobScheduler
    Create an app that sends a notification when the user taps a button in the app.
     Set a repeating alarm to notify you every 15 minutes.
     Use a ToggleButton to set and keep track of the alarm.
     Use Toast messages to notify the user when the alarm is turned on or off.
     Schedule the job using JobScheduler.
14. Shared preferences
    Create an app to save & retrieve a small amount data as simple key/value pairs.
15. Room, LiveData, and ViewModel & Deleting data from a Room database
    Create a RoomWordsSample app using some of the Android Architecture Components Room, ViewModel,
    and LiveData.
     Create an app with an Activity that displays words in a RecyclerView.
     Create an Entity that represents word objects.
     Define the mapping of SQL queries to Java methods in a DAO (data access object).
     Use LiveData to make changes to the data visible to the UI, by way of observers.
     Add a Room database to the app for persisting data locally, and initialize the database.
     Abstract the data backend as a Repository class with an API that is agnostic to how the data is stored or
    acquired.
     Use a ViewModel to separate all data operations from the UI.
     Add a second Activity that allows the user to add new words.
     Allow users to delete a specific word by swiping an item in the list.
