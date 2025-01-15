# Compose Basics App

A simple Android application built with Jetpack Compose demonstrating fundamental UI components and layouts. The app displays an image followed by three text sections with custom formatting and padding.

![image](https://github.com/user-attachments/assets/dfc76346-4931-4879-91e3-db1f2a6f2061)


## Features

- Material 3 design implementation
- Edge-to-edge content display
- Custom text formatting
- Image display
- Responsive layout with proper padding
- Preview support for development

## Structure

### Main Components

- `MainActivity`: Entry point of the application
- `HomePage`: Main composable function containing the layout structure
- `ImageComposable`: Reusable composable for displaying images
- `HomePagePreview`: Preview composable for development

### UI Elements

- **Layout**:
  - Uses `Column` for vertical arrangement
  - Implements `Scaffold` for Material 3 design structure
  - Edge-to-edge display enabled

- **Text Elements**:
  - Title: 24sp font size with 16dp padding
  - First Text: Justified alignment with horizontal padding
  - Second Text: Justified alignment with full padding

- **Image**:
  - Background image loaded from resources
  - Implemented as a separate composable for reusability

## Implementation

### Key Features

```kotlin
// Edge-to-edge implementation
enableEdgeToEdge()

// Scaffold usage with full size
Scaffold(modifier = Modifier.fillMaxSize())

// Text styling example
Text(
    text = title,
    fontSize = 24.sp,
    modifier = Modifier.padding(16.dp)
)
```

### String Resources
The app uses string resources for all text content:
- `R.string.title`
- `R.string.first_text`
- `R.string.second_text`

## Setup

1. Clone the repository
2. Open in Android Studio
3. Sync project with Gradle files
4. Run on an emulator or physical device

## Requirements

- Android Studio Hedgehog or newer
- Minimum SDK: [Your minimum SDK version]
- Kotlin 1.9+
- Jetpack Compose dependencies

## Dependencies

```gradle
dependencies {
    implementation 'androidx.activity:activity-compose:1.x.x'
    implementation 'androidx.compose.material3:material3:1.x.x'
    implementation 'androidx.compose.ui:ui:1.x.x'
    // Add your specific versions
}
```

## Preview

The app includes a preview function for development purposes. To use it:
1. Open `HomePagePreview` in Android Studio
2. Switch to Design view
3. Preview will show the layout with sample text

## Customization

To customize the app:
1. Modify string resources in `res/values/strings.xml`
2. Replace background image in `res/drawable/`
3. Adjust padding and text styling in `HomePage` composable

## Best Practices Demonstrated

- Proper Compose modifier usage
- Component reusability
- Material 3 implementation
- String resource externalization
- Preview implementation
- Proper padding and layout structure

