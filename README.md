# Multimodal Collector - Experimenter's Side
This is an Android application to collect sketching and speech simultaneously on experimenter's side.

## Requirements
* Two Android tablets (we recommend Samsung Galaxy Note 10.1) with an Internet connection
* [Android Studio](https://developer.android.com/studio/index.html)

## How to Install
* Download the entire source code
* Open Android Studio. In welcome screen, click on "Import Project", then browse the directory containing the source code
* Once you've opened the project, open ConnectionStatusActivity.java. On line 21, fill in the empty string with the IP address of participant's tablet.

Since there is not any available APK, you should install it manually through these steps:
* Plug in the experimenter's tablet, then run the application by clicking on Run button in Android Studio
* Stop running the application by clicking on Stop button (the application has already been installed by running it, then you can stop it)

## How to run
* Open the application
* Press Next and proceed to the next page. Then click Next over. These pages are supposed to give information (the things that are going to be recorded, the aim of using this application) about the application. 
* Follow the above steps on the [participant's tablet](https://github.com/ozymaxx/multimodal_collector/).
* You'll see the checkbox marked, meaning that the tablets has paired each other. Then click Next on both.
* Now both the experimenter and participant can draw anything. Whatever drawn in one side will be replicated on the other side. Moreover, if one gets his/her pen closer to the screen, then the other can see the location of that pen on his/her own screen. Please also note that your camera is recording your video while drawing.
* If you want to clean the shared canvas, press red X button. You can also switch to eraser mode by pressing the eraser button. Clicking on the pen icon will switch you back to the drawing mode on your side.
* When you're done, just hit "Çıkış" button, then terminate the application. You should also do the same on participant's side.

## Outputs
* **Sketch stream**: This is a plain text file with `.sketch` extension. It contains all the strokes drawn so far. However, due to the synchronization issues, we recommend using the one generated in the participant's side.
* **Video**: Video recorded on the experimenter's end.
<br />
These two files are named with the timestamp, at the root directory of your tablet.

## Credits
[Soccer field background](https://clipartfest.com/download/021ec02162b694153e20bc6c8f6c4c1361a387e7.html)
Ozan Can Altıok (oaltiok15 at ku dot edu dot tr) - [Koç University IUI Laboratory](http://iui.ku.edu.tr)
