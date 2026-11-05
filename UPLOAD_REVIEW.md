# GitHub 업로드 전 검토 목록

아래는 .gitignore 적용 후 커밋할 파일 목록입니다. 원본 과제 PDF와 에셋을 포함합니다.

제외: local.properties, .gradle/, .kotlin/, .idea/, .codex/, 모든 build/ 폴더, APK/AAB, 서명 키와 인증 정보 파일.

대상 저장소: https://github.com/DropGrandswordBrave/FoodOrdering
이 문서 자신도 커밋 대상에 포함됩니다.

```text
.gitignore
IMPLEMENTATION_STATUS.md
app/.gitignore
app/build.gradle.kts
app/src/androidTest/java/com/example/foodorderingapp/ExampleInstrumentedTest.kt
app/src/main/AndroidManifest.xml
app/src/main/java/com/example/foodorderingapp/MainActivity.kt
app/src/main/java/com/example/foodorderingapp/SplashActivity.kt
app/src/main/java/com/example/foodorderingapp/fragment/CartFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/HistoryFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/HomeFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/ProfileFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/SearchFragment.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Color.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Theme.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Type.kt
app/src/main/keepRules/rules.keep
app/src/main/res/drawable/cart.xml
app/src/main/res/drawable/history.xml
app/src/main/res/drawable/home.xml
app/src/main/res/drawable/ic_launcher_background.xml
app/src/main/res/drawable/ic_launcher_foreground.xml
app/src/main/res/drawable/search.xml
app/src/main/res/drawable/user.xml
app/src/main/res/layout/activity_main.xml
app/src/main/res/layout/activity_splash.xml
app/src/main/res/layout/fragment_cart.xml
app/src/main/res/layout/fragment_history.xml
app/src/main/res/layout/fragment_home.xml
app/src/main/res/layout/fragment_profile.xml
app/src/main/res/layout/fragment_search.xml
app/src/main/res/menu/bottom_navigation_menu.xml
app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml
app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml
app/src/main/res/mipmap-hdpi/ic_launcher.webp
app/src/main/res/mipmap-hdpi/ic_launcher_round.webp
app/src/main/res/mipmap-mdpi/ic_launcher.webp
app/src/main/res/mipmap-mdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xhdpi/ic_launcher.webp
app/src/main/res/mipmap-xhdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xxhdpi/ic_launcher.webp
app/src/main/res/mipmap-xxhdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xxxhdpi/ic_launcher.webp
app/src/main/res/mipmap-xxxhdpi/ic_launcher_round.webp
app/src/main/res/navigation/navigation.xml
app/src/main/res/values/colors.xml
app/src/main/res/values/strings.xml
app/src/main/res/values/themes.xml
app/src/main/res/xml/backup_rules.xml
app/src/main/res/xml/data_extraction_rules.xml
app/src/test/java/com/example/foodorderingapp/ExampleUnitTest.kt
assets/Kotlin 19. Android UI Components and Layouts (2).pdf
assets/assets of foododring/admindrawable/addimage.png
assets/assets of foododring/admindrawable/arrow_down.xml
assets/assets of foododring/admindrawable/arrow_left.xml
assets/assets of foododring/admindrawable/attantion.xml
assets/assets of foododring/admindrawable/cart.xml
assets/assets of foododring/admindrawable/dollar.xml
assets/assets of foododring/admindrawable/edit.xml
assets/assets of foododring/admindrawable/edittextshape.xml
assets/assets of foododring/admindrawable/eye.xml
assets/assets of foododring/admindrawable/facebook.xml
assets/assets of foododring/admindrawable/google.xml
assets/assets of foododring/admindrawable/greenbuttonshape.xml
assets/assets of foododring/admindrawable/greencard.xml
assets/assets of foododring/admindrawable/home.xml
assets/assets of foododring/admindrawable/ic_launcher_background.xml
assets/assets of foododring/admindrawable/icon_minus.xml
assets/assets of foododring/admindrawable/icon_plus.xml
assets/assets of foododring/admindrawable/lock.xml
assets/assets of foododring/admindrawable/log_out.xml
assets/assets of foododring/admindrawable/logo.xml
assets/assets of foododring/admindrawable/mail.xml
assets/assets of foododring/admindrawable/menu1.jpg
assets/assets of foododring/admindrawable/menu2.jpg
assets/assets of foododring/admindrawable/menu3.jpg
assets/assets of foododring/admindrawable/menu4.jpg
assets/assets of foododring/admindrawable/menu5.jpg
assets/assets of foododring/admindrawable/pluse_round.xml
assets/assets of foododring/admindrawable/right.xml
assets/assets of foododring/admindrawable/search.xml
assets/assets of foododring/admindrawable/shopping_bag.xml
assets/assets of foododring/admindrawable/trash.xml
assets/assets of foododring/admindrawable/user.xml
assets/assets of foododring/admindrawable/user_plus.xml
assets/assets of foododring/admindrawable/usernew.xml
assets/assets of foododring/drawable/addtocartshape.xml
assets/assets of foododring/drawable/arrow_down.xml
assets/assets of foododring/drawable/arrow_left.xml
assets/assets of foododring/drawable/arrow_up.xml
assets/assets of foododring/drawable/attantion.xml
assets/assets of foododring/drawable/banner1.jpg
assets/assets of foododring/drawable/banner2.jpg
assets/assets of foododring/drawable/banner3.jpg
assets/assets of foododring/drawable/bell.xml
assets/assets of foododring/drawable/burrgar.xml
assets/assets of foododring/drawable/cart.xml
assets/assets of foododring/drawable/cashondelivery.png
assets/assets of foododring/drawable/congrats.xml
assets/assets of foododring/drawable/congratulation.xml
assets/assets of foododring/drawable/dollar.xml
assets/assets of foododring/drawable/edit.xml
assets/assets of foododring/drawable/edittextshape.xml
assets/assets of foododring/drawable/eye.xml
assets/assets of foododring/drawable/eye_hide.xml
assets/assets of foododring/drawable/facebook.xml
assets/assets of foododring/drawable/gohomeshape.xml
assets/assets of foododring/drawable/google.xml
assets/assets of foododring/drawable/greenbuttongradient.xml
assets/assets of foododring/drawable/history.xml
assets/assets of foododring/drawable/home.xml
assets/assets of foododring/drawable/ic_launcher_background.xml
assets/assets of foododring/drawable/lock.xml
assets/assets of foododring/drawable/logo.xml
assets/assets of foododring/drawable/mail.xml
assets/assets of foododring/drawable/menu1.jpg
assets/assets of foododring/drawable/menu2.jpg
assets/assets of foododring/drawable/menu3.jpg
assets/assets of foododring/drawable/menu4.jpg
assets/assets of foododring/drawable/menu5.jpg
assets/assets of foododring/drawable/menu6.jpg
assets/assets of foododring/drawable/menu7.jpg
assets/assets of foododring/drawable/minus.xml
assets/assets of foododring/drawable/plus.xml
assets/assets of foododring/drawable/proceedbutonshape.xml
assets/assets of foododring/drawable/profileedittextshape.xml
assets/assets of foododring/drawable/restorent.jpeg
assets/assets of foododring/drawable/right.xml
assets/assets of foododring/drawable/sademoji.xml
assets/assets of foododring/drawable/search.xml
assets/assets of foododring/drawable/serachshape.xml
assets/assets of foododring/drawable/textviewshape.xml
assets/assets of foododring/drawable/trash.xml
assets/assets of foododring/drawable/truck.xml
assets/assets of foododring/drawable/user.xml
assets/assets of foododring/drawable/user_plus.xml
assets/assets of foododring/drawable/whitebutton.xml
build.gradle.kts
gradle.properties
gradle/gradle-daemon-jvm.properties
gradle/libs.versions.toml
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
gradlew
gradlew.bat
settings.gradle.kts
UPLOAD_REVIEW.md
```
