# Music PlaylistApp 

Here is a link to the Github Repository : https://github.com/AshvaanSurujbally/Imad_Summative


Welcome to the **Music Playlist App**, a app that lets users create a playlist and display them with a bonus rating of the playlist

## Features

- Simple **User Freindly**  format
- **Ratings** to score your playlist
- **Menu Screeen** show all the cool inputs that allow users to create the best list
- **Detail screen** screen displaying all the tracks inculding a rating button which score the playlist overall
- **Easy navigation** with options for Next,Exit and return

## How It Works

### **Main screen (`MainActivity.kt`)**
- Users must enter there artist name,song name and also comments about the track 
- Input validation ensures the field isn't empty.
- Users will also input a rating for tracks to keep track fo their favourite beats **personalized experience**.

### **DetailScreen (`detailscreen.kt`)**
- This screen allows users to display there songs they have added to there playlist
- Options available:
- Display Playlist, Average rating and Return
- There is a option for users to see their average rating of the playlist via a rating button

  ## Future Improvement
  - Allow users include their favourite Artist in the playlist
  - Add a login page for a more personalized experience.
  - UI improvemts by added sounds to the buttons and music animations

    ## Technologies Used
- **Kotlin**
- **Android SDK** (Jetpack, AppCompat)
- **Activity & Intent-based Navigation**
- **View Components:** `TextView`, `EditText`, `Buttons`, `Toasts`

  ## Get Involved!
We welcome **feedback and contributions**! If you'd like to:
- Add more questions
- Enhance the UI
- Implement a new feature

## Scrrenshots from the app


![Screenshot 2025-06-19 122909](https://github.com/user-attachments/assets/f609728d-effc-407d-a377-a46eb4ffc501)

This is what the user sees upon running the app. The app has a heading along have textboxs and hints that tell the user what to enter in each box.
The App will not acecept the users inputs without all text fileds being filled and also if the user has not 
a number between 1-5 for the ratings. The app will prompt the user if these requirements are not met accordingly using the correct methods needed.
There is also a button that  will navigate the user to the next screen and a button to close the app. The buttons are marked in differenct colours to make it 
 easier for the user to see and select correctly. Here the app will store the users inputs in 4 arrays and this information will get passed to the next page to display.


 ![Screenshot 2025-06-19 123118](https://github.com/user-attachments/assets/d78cb30d-a1bf-405c-becb-65267ef7f4a5)

Here the user has inputted their information and the app has each box in diffrenct colours to make it look more appealing.The 
app will accept these inputs from the user because each box is filled correctly and has the relavant information needed. The text
are in a meduim size front to make easier for the user to see.

![Screenshot 2025-06-19 123142](https://github.com/user-attachments/assets/42677bf4-ad0a-4c30-859d-ae6f4c72452c)

The user has moved to the deatil page when the selected the next button. The user is greeted with three buttons to choose from. 
The first button display the user inputs from the pervious page. The rating button will display the average number from all the songs 
listed by the user,using a loop. The Display playlist button will display all the songs the user has entered along the relavant information
from the array using stringbuilder and a loop.

![Screenshot 2025-06-19 123353](https://github.com/user-attachments/assets/af9e6fbf-a30c-47f6-8afd-abcb93492a54)
The user has now pressed the display button and also the rating button and this caused the app to display all the songs 
and information given by the user in the textbox. The rating button causes the app to add all the ratings from the song
and divide them by how many songs their are using a counter to count the number of songs.The array has been displayed using
a loop along with stringbuilder to make coding simpilier and easier. Finally if the user enters the return they will go back 
to the mainb screen.

## Screenshots of code
![Screenshot 2025-06-19 131845](https://github.com/user-attachments/assets/d362aef3-ba58-48b8-a560-dd33dad7c77b)
![Screenshot 2025-06-19 131909](https://github.com/user-attachments/assets/ace24e9e-0ae4-4e71-988b-4826f77b8643)
![Screenshot 2025-06-19 131923](https://github.com/user-attachments/assets/53f5058a-38c0-462a-a44a-6f25badfd486)
![Screenshot 2025-06-19 131942](https://github.com/user-attachments/assets/55a6fba4-614e-47b6-8497-eb9a71e55107)
![Screenshot 2025-06-19 131959](https://github.com/user-attachments/assets/c546a618-2079-4ad1-9870-28d1ca97e0aa)

## Main Screen

![Screenshot 2025-06-19 132329](https://github.com/user-attachments/assets/49fda329-3d6e-4625-9faf-31c97a8323f9)

## Detail Screen

![Screenshot 2025-06-19 132338](https://github.com/user-attachments/assets/9f7b5ae8-d985-4795-8f9c-8700235e8bcb)







