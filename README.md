# AssistGo! Android App
AssistGo! is a mobile application that makes the communication features of a phone out-of-the-box accessible. The standard Android user interface is overcrowded with unnecessary features and configurations that take away from the primary purpose of a cell phone: communication for daily and emergency use. Android provides users the ability to make their device more accessible with a multitude of accessibility configurations. However, it requires users to be aware of these options and be able to manually adjust them to their needs. This accessibility solution provided by Android creates a large barrier of knowledge.

AssistGo! leverages a simple user interface so users with accessibility issues such as visual impairments, limited literacy, and language barriers can easily access primary functions of communication such as voice/video calls and chat. AssistGo! makes it easy for users to add, edit and remove contacts, in addition to providing in-app translation features so those that may have a language barrier can translate without needing a third party. Users are also able to call the local emergency services without the need to look up the service numbers. At a high level, AssistGo! provides users with a simpler way to communicate.

Technologies
Android SDK
XML
Java
Twilio Video API
Google Speech to Text
Prerequisites
Java needs to be installed on version 11
Android Studio needs to be installed
Android Studio Emulator needs to be on API version 30 or You need a physical android device
Also follow the instructions below to set up Twilio Video Chat:
Configure account information
Every sample in the demo requires some basic credentials from your Twilio account. Configure these first.

Config Value	Description
TWILIO_ACCOUNT_SID	Your primary Twilio account identifier - find this in the console here.
TWILIO_API_KEY	Used to authenticate - generate one here.
TWILIO_API_SECRET	Used to authenticate - just like the above, you'll get one here.
A Note on the Information Above
Put the information above in the apikey.properties file in the root directory of this project in this format:



A Note on API Keys
When you generate an API key pair at the URLs above, your API Secret will only be shown once - make sure to save this information in a secure location, or possibly your ~/.bash_profile.

Configure product-specific settings
Depending on which demos you'd like to run, you may need to configure a few more values in your .env file.

Configuring Twilio Sync
Twilio Sync works out of the box, using default settings per account. Once you have your API keys configured and your Java application built and running, open a browser!

Configuring Twilio Chat
In addition to the above, you'll need to generate a Chat Service in the Twilio Console. Put the result in your .env file.

| Config Value | Where to get one. | | :------------------------ | :---------------- | --------------------------------------------------------------------------------------- | | TWILIO_CHAT_SERVICE_SID | Chat | Generate one in the Twilio Chat console |

Configuring Twilio Notify
You will need to create a Notify Service and add at least one credential on the Mobile Push Credential screen (such as Apple Push Notification Service or Firebase Cloud Messaging for Android) to send notifications using Notify.

Config Value	Where to get one.
TWILIO_NOTIFICATION_SERVICE_SID	Generate one in the Notify Console and put this in your .env file.
A Push Credential	Generate one with Apple or Google and configure it as a Notify credential.
Once you've done that, run the application and open a browser!

Run the sample application
Sample Application

This application uses the lightweight Spark Framework, and requires Java 8.

Edit .env with the four configuration parameters we gathered from above.

Now that the application is configured, we need to install our dependencies from Maven.

mvn install
And compile our application code:

mvn package
Now we should be all set! Run the application using the java -jar command.

java -jar target/sdk-starter-1.0-SNAPSHOT.jar
Your application should now be running at http://localhost:4567/.

Home Screen

Check your config values, and follow the links to the demo applications!

Running the SDK Starter Kit with ngrok
If you are going to connect to this SDK Starter Kit with a mobile app (and you should try it out!), your phone won't be able to access localhost directly. You'll need to create a publicly accessible URL using a tool like ngrok to send HTTP/HTTPS traffic to a server running on your localhost. Use HTTPS to make web connections that retrieve a Twilio access token.

ngrok http 4567
Ins

## Resources
- [Codepath Android Playlist Link](https://www.youtube.com/playlist?list=PLrT2tZ9JRrf6_UwKHwI5bzZTn2Qw4zf_F)
- [Custom Dialog + Senidng Informtion to Activity](https://www.youtube.com/watch?v=ARezg1D9Zd0&t=389s&ab_channel=CodinginFlow)
- [Time Formatter](https://github.com/nesquena/TimeFormatter)
- [Timestamp](https://www.youtube.com/watch?v=7QVr5SgpVog)
- [Modifying Contact Lsit](https://www.dev2qa.com/how-to-update-delete-android-contacts-programmatically/)
- [Changing contact pictures](https://stackoverflow.com/questions/17789256/change-contact-picture-programmatically)
- [Pull to refresh](https://guides.codepath.org/android/Implementing-Pull-to-Refresh-Guide)
- [Gallery Access](https://www.youtube.com/watch?v=HtS-qI54GKk)
- [Floating Action Button](https://guides.codepath.org/android/Floating-Action-Buttons)


Edited Classes:

About_Page.xml
profile_page.xml
preferences_page_layout.xml
preferences_page_cell1.xml
settings_pagelayout.xml
home_page.xml
em_page_layout.xml
police_page.xml
firefighter_page.xml
contact_page.xml
homemesssafe_page.xml

New Classes:

qr_popup.xml
border.xml
coner.xml

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Resource:

UI Design: 

https://dribbble.com/shots/15131492-uStock-Profile-Community

Codes: 
https://code2care.org/pages/how-to-add-border-to-android-textview#:~:text=To%20add%20a%20border%20to,the%20border%20width%20and%20color.

https://stackoverflow.com/questions/16176210/how-to-display-2-textviews-in-the-same-line-in-android

https://www.ssaurel.com/blog/how-to-create-a-layout-with-rounded-corner-borders-in-android/
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


            android:onClick="openDatePickerDeadline"



Help: 
1) User is able to click on the qr code to get popup imaage [layout-> qr_popup.xml => for the profile]


![RemodleUI](https://user-images.githubusercontent.com/45721682/166282587-4d142763-47b9-4cef-bdb8-a12cc3515350.gif)

