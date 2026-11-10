# Green Food Order App — implementation status

## 첨부 화면 반영 — 현재 시작 화면

- 사용자가 제공한 두 화면을 기준으로 Splash와 Welcome 화면을 구현했습니다. 앱 표시 이름은 `Keimyung Eats`이며 패키지명은 유지했습니다.
- 시작 순서: **SplashActivity (3초) → WelcomeActivity**. Next는 LoginActivity로, Next 위의 Skip은 로그인 없이 MainActivity(Home 및 하단 메뉴)로 이동합니다. Skip 후 Welcome을 종료하여 뒤로 가기로 안내 화면이 다시 열리지 않게 했습니다. LoginActivity의 상세 양식은 아직 임시 제목 화면입니다.
- Splash: 음식 로고, 앱 이름, 제공된 문구 `Deliever Favorite Food`, 하단 `Design By / NeatRoots`를 배치했습니다.
- Welcome: 버거 일러스트, 안내 문구, 초록색 그라데이션 Next 버튼과 크레딧을 배치했습니다. 첨부 이미지의 검은 여백과 초록 테두리는 화면 바깥의 표시이므로 앱에는 넣지 않았습니다.
- 원본 `assets/assets of foododring/drawable/logo.xml`, `burrgar.xml`을 변경하지 않고 `res/drawable/onboarding_logo.xml`, `onboarding_burger.xml`로 복사했습니다.
- 정확한 원본 글꼴 파일이 없어 유사한 손글씨 형태인 Itim을 사용했습니다. [Google Fonts 공식 원본](https://github.com/google/fonts/tree/main/ofl/itim)과 OFL 라이선스를 `assets-source/fonts/itim/`에 보관하고, 글꼴은 `res/font/`, 라이선스는 `res/raw/`에도 포함했습니다.
- ConstraintLayout과 비율 가이드로 배치하고, 짧은 화면이나 가로 모드에서는 스크롤할 수 있도록 했습니다. 시작 두 화면은 첨부 자료에 맞춰 밝은 테마를 사용합니다.
- 기존 5개 탭 MainActivity와 Fragment는 보존했습니다. Main의 임시 Next 버튼은 Welcome으로 옮겼으며, Welcome의 Skip 버튼으로 로그인 없이 Main에 진입할 수 있습니다. 실제 로그인 인증 후 Main으로 이동하는 흐름은 아직 구현하지 않았습니다.
- 변경 파일: SplashActivity.kt / activity_splash.xml, WelcomeActivity.kt / activity_welcome.xml, MainActivity.kt / activity_main.xml, AndroidManifest.xml, values의 strings/colors/themes, onboarding drawable 3개, font/raw 리소스, app/build.gradle.kts 및 gradle/libs.versions.toml.
- 검증: Android Studio MCP 빌드 성공, Gradle assembleDebug 성공(32초). API 37 에뮬레이터에서 Splash → Welcome, Next → Login, 로그인에서 뒤로 돌아온 후 Next 재사용, 가로 모드 스크롤 후 Next 사용, Welcome에서 뒤로 가기 시 Splash 재진입 없이 종료를 확인했습니다.
- 이후 추가한 Skip 버튼도 Android Studio MCP 빌드를 통과했습니다. Skip 추가 후 에뮬레이터 실행 검증은 별도로 수행하지 않았습니다.
- 실행 캡처: `build/onboarding-review/splash.png`, `welcome.png`, `welcome-landscape.png`. 검증 결과: `build/onboarding-review/results.txt`.

## 2026-11-10 이전 단계 기록

- PDF 20–24장의 Next → LoginActivity 이동을 View Binding으로 추가했습니다. MainActivity의 기존 하단 메뉴는 유지했습니다.
- LoginActivity와 activity_login.xml을 추가했습니다. 현재는 Login 제목을 표시하는 진입 화면이며, 로그인 양식이나 인증 기능을 완성한 상태는 아닙니다.
- 세 Activity에 enableEdgeToEdge()를 적용해 시스템 테마에 맞게 상태 표시줄 아이콘 색상을 처리했습니다.
- Android Studio MCP 빌드와 Gradle assembleDebug가 성공했습니다.
- API 37 에뮬레이터에서 5개 탭의 제목/선택 상태, Next로 로그인 화면 열기, 로그인에서 뒤로 가기 후 기존 탭 복귀, 회전 후 Cart 탭 유지, 최초 Home에서 뒤로 가기 시 Splash 재진입 없이 종료를 확인했습니다.
- 테스트 결과와 실제 실행 캡처는 build/emulator-review/에 있습니다. 생성 파일이므로 Git 업로드 대상에는 포함되지 않습니다.
- 여전히 필요한 자료: Green Food의 Splash·시작 안내·로그인·회원가입·위치 선택·5개 탭 화면 캡처. 자료가 없어 색상·이미지·간격·버튼 등 상세 디자인은 보류 중입니다.
- 현재 PDF 진행 범위: 16–18장 Splash 동작, 20–24장 화면 이동/Binding 예제, 26–37장 메뉴/Fragment/Navigation 구조와 38장 기본 실행 확인. 11–15장 전체 에셋·색상 적용 및 19/25장 디자인은 미완료입니다.

## Source review

- Read all 39 pages of `assets/Kotlin 19. Android UI Components and Layouts (2).pdf`, including embedded screenshots. Rendered review copies and extracted text are under `build/pdf-review/` (generated, not application resources).
- Pages 1–10: Android Studio setup and the initial XML activity example.
- Pages 11–15: Figma, drawable imports and custom resource colors. The sample colors XML contains invalid markup; it must not be copied verbatim.
- Pages 16–19: SplashActivity as the launcher, a three-second transition, and splash/main layout examples.
- Pages 20–24: a Next button opening LoginActivity, followed by View Binding setup/examples.
- Page 25: splash, introduction, login, registration and location design examples.
- Pages 26–31: bottom menu, five fragments and distinct fragment titles; menu IDs must match destination IDs.
- Pages 32–37: navigation graph, NavHostFragment and setupWithNavController.
- Pages 38–39: navigation run check and end of document.

## Design dependency

The Figma URL could not be opened. The user has now supplied a screenshot for Splash and Welcome, and those two designs have been implemented. There is no reference yet for the remaining screens.

The five fragment layouts and Login remain title-only placeholders. Login, registration, location selection and detailed tab designs still need reference materials. Splash and Welcome are no longer title-only placeholders.

Please supply screenshots or exports for Login, registration, location selection, Home, Cart, Search, History and Profile for the remaining design work. Put them in `design-reference/` or attach them in the conversation. Supply the original design font if an exact font match is required.

## Implemented structure

| Files | Role |
| --- | --- |
| `app/build.gradle.kts`, `gradle/libs.versions.toml` | View Binding; AppCompat, Fragment, Navigation, Material Views and ConstraintLayout dependencies. Preserve SDK/application ID and existing Compose theme source compatibility. |
| `app/src/main/AndroidManifest.xml` | Make SplashActivity the single exported launcher; MainActivity is internal. |
| `app/src/main/java/com/example/foodorderingapp/SplashActivity.kt` | Branded Splash; wait three seconds while started, open WelcomeActivity, finish splash. Save the deadline across recreation and cancel work on destruction. |
| `app/src/main/java/com/example/foodorderingapp/WelcomeActivity.kt` | Reference-based introduction screen; View Binding; Next opens LoginActivity. |
| `app/src/main/java/com/example/foodorderingapp/MainActivity.kt` | Preserve XML Views bottom navigation and its five destinations. |
| `app/src/main/java/com/example/foodorderingapp/LoginActivity.kt` | View Binding login destination for the PDF's Next-button example; temporary title-only layout. |
| `app/src/main/java/com/example/foodorderingapp/fragment/{Home,Cart,Search,History,Profile}Fragment.kt` | Five destinations, each with its own View Binding, cleared in onDestroyView. |
| `app/src/main/res/layout/activity_{main,splash,welcome,login}.xml` | Bottom navigation host; reference-based splash/introduction; temporary login layout. |
| `app/src/main/res/layout/fragment_{home,cart,search,history,profile}.xml` | Separate temporary layouts identifying each destination (PDF page 31). |
| `app/src/main/res/navigation/navigation.xml` | Five destinations; Home is the initial destination. |
| `app/src/main/res/menu/bottom_navigation_menu.xml` | Home, Cart, Search, History and Profile, with matching graph IDs. |
| `app/src/main/res/drawable/{home,cart,search,history,user}.xml` | Copies of the supplied vector icons; original files are preserved. |
| `app/src/main/res/drawable/onboarding_*.xml` | Original vector illustration copies and the rounded gradient/ripple button background. |
| `app/src/main/res/font/itim_regular.ttf`, `app/src/main/res/raw/itim_license.txt` | Bundled handwritten font and its distribution license. |
| `app/src/main/res/values/{strings,colors,themes}.xml` | Screen text, menu titles, onboarding colors and a white onboarding theme. Remaining screen styling is pending. |

No original assets or unrelated project files were removed. Actual activities/fragments use Kotlin and XML Views only. Existing `ui/theme` Compose files and their build dependencies are retained to preserve existing source files; they are not used by the app screens.

The original images are in `assets/assets of foododring/`, rather than `assets-source/`. Future selected bitmap copies should go in `drawable-nodpi` (or another appropriate Android resource directory); do not overwrite originals.

## Verification

- All application XML files parse successfully.
- All five bottom menu IDs match their corresponding graph destination IDs.
- Copied vector hashes match the supplied originals.
- Android Studio MCP build exceeded its 60-second timeout without returning compiler diagnostics; direct Gradle verification follows separately.
- Direct `:app:assembleDebug` completed successfully (39 tasks, 1m 33s). APK: `app/build/outputs/apk/debug/app-debug.apk`.
- Kotlin daemon reported incremental cache errors; Gradle successfully compiled using its fallback strategy. This build therefore succeeded, but the daemon/cache warning is recorded rather than represented as a source compilation error.
- API 37 emulator navigation checks passed on 2026-11-10 (see the current progress section). Final reference-based visual acceptance remains pending.

## Remaining emulator checks

- Rotate or background/resume during splash; ensure no duplicate MainActivity launch.
- Test repeated taps on the selected tab and additional back-stack scenarios.
- Verify status/navigation bar insets on API 24 and with button navigation; API 37 gesture-navigation portrait/landscape was exercised.
- Check dark mode and font scaling.
- After reference-based design implementation, verify scrolling, font scaling, image cropping, spacing, keyboard behavior and button interactions on multiple screen sizes.

## Implementation references

- [Android View Binding](https://developer.android.com/topic/libraries/view-binding)
- [Connect UI components to NavController](https://developer.android.com/guide/navigation/integrations/ui)

The NavHost remains a FragmentContainerView; there is no need to apply the PDF's outdated workaround of changing it to a fragment tag. Gradle uses `buildFeatures.viewBinding = true` with Kotlin DSL rather than the old example syntax.
