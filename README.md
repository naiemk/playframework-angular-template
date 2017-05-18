# playframework-angular-template
A template to quick start web development with play framework and angular-js

The goal for this project is to facilitate separation of UI development from the back-end development:

```
+playframework-angular-template
|
+- backend
|        +- back-end-play-project
+- frontend
|        +- front-end-angular-project
+- stuff-to-connect-them
```

## Connecting the dots

There are several ways to make the backend work with front end:

### Set the front-end as external resource.

In the play framework ROUT document set up external resource for /*file

```
GET        /api                    controllers.HomeController.index
GET        /api/serve              controllers.HomeController.serve
GET        /api/alerts             controllers.HomeController.alerts

->         /v1/posts               v1.post.PostRouter


# Map static resources from the ../../../fronted/<frontend-project>/build folder to the / URL path
GET        /*file                  controllers.ExternalAssets.at(path=java.nio.file.Paths.get(java.nio.file.Paths.get(play.Environment.simple().rootPath().getAbsolutePath).getParent.getParent.getParent.toString,"frontend/SB-Admin-BS4-Angular-4/build").toString, file)

```

Run the frontend using ng cli targeted to build in the build folder:

```
ng build --output-path ./build --env dev -w
```

### Use npm and proxy

Use NPM for front end angular. Then use a proxy to call both frontend and backend on the same port and address (except that backend would be behind /api).
