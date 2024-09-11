AssistGo! Android App
AssistGo! is a mobile application designed to make communication on Android phones accessible right out of the box. The default Android user interface can be cluttered with unnecessary features, detracting from the phone's primary purpose—communication for daily and emergency use. While Android provides a wide range of accessibility configurations, setting these up requires awareness and technical know-how, which can pose a challenge for many users.

AssistGo! offers a simplified user interface to help individuals with accessibility issues (such as visual impairments, limited literacy, or language barriers) access essential communication features like voice/video calls and messaging. The app also makes it easy to manage contacts and includes an in-app translation tool, allowing users to overcome language barriers without the need for third-party apps. Additionally, users can easily contact local emergency services without needing to search for numbers. In short, AssistGo! provides a streamlined solution for communication.

Features
Simplified UI for primary communication functions (voice/video calls, messaging)
Easy contact management (add, edit, remove contacts)
In-app translation feature
One-tap access to local emergency services
Accessible for users with visual impairments, limited literacy, and language barriers
Technologies Used
Android SDK
XML
Java
Twilio Video API
Google Speech-to-Text
Prerequisites
Java (version 11)
Android Studio
Android Studio Emulator (API version 30 or higher) or a physical Android device
Twilio Setup Instructions
Follow these steps to configure Twilio for the app:

Configure Account Information

TWILIO_ACCOUNT_SID: Your Twilio account identifier (find it in the console here).
TWILIO_API_KEY: Generate one here.
TWILIO_API_SECRET: Obtain it from the same link as the API key.
Add these details to the apikey.properties file in the root directory of the project.

Configure Product-Specific Settings

Twilio Sync: Works out of the box. Just ensure your API keys are configured.
Twilio Chat: Generate a Chat Service in the Twilio Console and add it to your .env file.
Twilio Notify: Create a Notify Service and add a mobile push credential (Apple or Firebase) for notifications.
Running the Application
Install Dependencies
Use Maven to install the project dependencies:

bash
Copy code
mvn install
Compile the Application
Compile the app code:

bash
Copy code
mvn package
Run the Application
Launch the application with the following command:

bash
Copy code
java -jar target/sdk-starter-1.0-SNAPSHOT.jar
The application will now be running at http://localhost:4567/.

Running with ngrok
To connect a mobile app, use ngrok to create a public URL:

bash
Copy code
ngrok http 4567
Resources
Codepath Android Playlist
Custom Dialog + Sending Information to Activity
Time Formatter
Timestamp Tutorial
Modify Android Contact List
Change Contact Pictures
Implement Pull-to-Refresh
Gallery Access
Floating Action Button
UI Design Resources
uStock Profile Community
Adding Borders to Android TextView
Creating Rounded Corner Borders
Edited Classes
About_Page.xml
profile_page.xml
preferences_page_layout.xml
settings_pagelayout.xml
home_page.xml
contact_page.xml
New Classes
qr_popup.xml
border.xml
coner.xml
