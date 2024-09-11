# AssistGo! Android App

**AssistGo!** is a mobile application designed to make communication on Android phones accessible right out of the box. The default Android user interface can be cluttered with unnecessary features, detracting from the phone's primary purpose—communication for daily and emergency use. While Android provides a wide range of accessibility configurations, setting these up requires awareness and technical know-how, which can pose a challenge for many users.

AssistGo! offers a simplified user interface to help individuals with accessibility issues (such as visual impairments, limited literacy, or language barriers) access essential communication features like voice/video calls and messaging. The app also makes it easy to manage contacts and includes an in-app translation tool, allowing users to overcome language barriers without the need for third-party apps. Additionally, users can easily contact local emergency services without needing to search for numbers. In short, AssistGo! provides a streamlined solution for communication.

## Features
- Simplified UI for primary communication functions (voice/video calls, messaging)
- Easy contact management (add, edit, remove contacts)
- In-app translation feature
- One-tap access to local emergency services
- Accessible for users with visual impairments, limited literacy, and language barriers

## Technologies Used
- Android SDK
- XML
- Java
- Twilio Video API
- Google Speech-to-Text

## Prerequisites
- **Java** (version 11)
- **Android Studio**
- **Android Studio Emulator** (API version 30 or higher) or a physical Android device

### Twilio Setup Instructions
Follow these steps to configure Twilio for the app:

1. **Configure Account Information**  
   - **TWILIO_ACCOUNT_SID**: Your Twilio account identifier (find it in the console [here](https://www.twilio.com/console)).
   - **TWILIO_API_KEY**: Generate one [here](https://www.twilio.com/console).
   - **TWILIO_API_SECRET**: Obtain it from the same link as the API key.

   Add these details to the `apikey.properties` file in the root directory of the project.

2. **Configure Product-Specific Settings**
   - **Twilio Sync**: Works out of the box. Just ensure your API keys are configured.
   - **Twilio Chat**: Generate a Chat Service in the Twilio Console and add it to your `.env` file.
   - **Twilio Notify**: Create a Notify Service and add a mobile push credential (Apple or Firebase) for notifications.

### Running the Application
1. **Install Dependencies**  
   Use Maven to install the project dependencies:
   ```bash
   mvn install
