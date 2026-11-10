# GitHub 업로드 파일 검토

대상: https://github.com/DropGrandswordBrave/FoodOrdering (main)

이번 변경: Splash/Welcome 디자인, Next → Login 진입, Skip → Home 진입, 글꼴과 라이선스, 진행 기록.

제외 확인: local.properties, 모든 build/ 폴더, APK/AAB, IDE/Gradle/Kotlin 캐시, 서명 키 및 인증 정보 파일.
소스/설정 텍스트에 대한 일반적인 비밀키/토큰 패턴 검사에서 일치 항목이 없었습니다.

## 이번 커밋 변경 파일

```text
app/build.gradle.kts
app/src/main/AndroidManifest.xml
app/src/main/java/com/example/foodorderingapp/LoginActivity.kt
app/src/main/java/com/example/foodorderingapp/MainActivity.kt
app/src/main/java/com/example/foodorderingapp/SplashActivity.kt
app/src/main/java/com/example/foodorderingapp/WelcomeActivity.kt
app/src/main/res/drawable/onboarding_burger.xml
app/src/main/res/drawable/onboarding_logo.xml
app/src/main/res/drawable/onboarding_next_background.xml
app/src/main/res/font/itim_regular.ttf
app/src/main/res/layout/activity_login.xml
app/src/main/res/layout/activity_splash.xml
app/src/main/res/layout/activity_welcome.xml
app/src/main/res/raw/itim_license.txt
app/src/main/res/values/colors.xml
app/src/main/res/values/strings.xml
app/src/main/res/values/themes.xml
assets-source/fonts/itim/Itim-Regular.ttf
assets-source/fonts/itim/OFL.txt
gradle/libs.versions.toml
IMPLEMENTATION_STATUS.md
UPLOAD_REVIEW.md
```

## 전체 추적 대상 파일

```text
.gitignore
app/.gitignore
app/build.gradle.kts
app/src/androidTest/java/com/example/foodorderingapp/ExampleInstrumentedTest.kt
app/src/main/AndroidManifest.xml
app/src/main/java/com/example/foodorderingapp/fragment/CartFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/HistoryFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/HomeFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/ProfileFragment.kt
app/src/main/java/com/example/foodorderingapp/fragment/SearchFragment.kt
app/src/main/java/com/example/foodorderingapp/LoginActivity.kt
app/src/main/java/com/example/foodorderingapp/MainActivity.kt
app/src/main/java/com/example/foodorderingapp/SplashActivity.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Color.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Theme.kt
app/src/main/java/com/example/foodorderingapp/ui/theme/Type.kt
app/src/main/java/com/example/foodorderingapp/WelcomeActivity.kt
app/src/main/keepRules/rules.keep
app/src/main/res/drawable/cart.xml
app/src/main/res/drawable/history.xml
app/src/main/res/drawable/home.xml
app/src/main/res/drawable/ic_launcher_background.xml
app/src/main/res/drawable/ic_launcher_foreground.xml
app/src/main/res/drawable/onboarding_burger.xml
app/src/main/res/drawable/onboarding_logo.xml
app/src/main/res/drawable/onboarding_next_background.xml
app/src/main/res/drawable/search.xml
app/src/main/res/drawable/user.xml
app/src/main/res/font/itim_regular.ttf
app/src/main/res/layout/activity_login.xml
app/src/main/res/layout/activity_main.xml
app/src/main/res/layout/activity_splash.xml
app/src/main/res/layout/activity_welcome.xml
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
app/src/main/res/raw/itim_license.txt
app/src/main/res/values/colors.xml
app/src/main/res/values/strings.xml
app/src/main/res/values/themes.xml
app/src/main/res/xml/backup_rules.xml
app/src/main/res/xml/data_extraction_rules.xml
app/src/test/java/com/example/foodorderingapp/ExampleUnitTest.kt
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
assets/Kotlin 19. Android UI Components and Layouts (2).pdf
assets-source/fonts/itim/Itim-Regular.ttf
assets-source/fonts/itim/OFL.txt
build.gradle.kts
gradle.properties
gradle/gradle-daemon-jvm.properties
gradle/libs.versions.toml
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
gradlew
gradlew.bat
IMPLEMENTATION_STATUS.md
settings.gradle.kts
UPLOAD_REVIEW.md
```
