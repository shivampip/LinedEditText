# LinedEditText
Android Lined EditText like Notepad

## Getting Started

This library allows you to add Lined EditText in your application with ease


### Installing

* Add this line in your project level gradle file

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```

Add this line in your app level gradel file

```
dependencies {
	        implementation 'com.github.shivampip:LinedEditText:6e5e019dee'
}
```

and click on Sync Now

## Usage

You can easily integrate it in your layout file

```
<com.shivampip.LinedEditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Hello World \nIt's Working"
        android:padding="10dp"
        app:lineTextGap="1.0"
        app:lineWidth="1.0"
        app:lineColor="#000000"/>
```   



## Built With

* [Android Studio](https://developer.android.com/studio)

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Shivam Agrawal** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

