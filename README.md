A [Giter8][g8] template for a project to be adopting [Lerna Project](https://github.com/lerna-stack)!

## Overview

This project provides a *g8* template for a project to be adopting *Lerna*.
To create a new project using this template, Use `sbt new` like below.

```shell
# Create a new project from the `main` branch (stable, the latest).
sbt new lerna-stack/lerna.g8
```

If you want to use another version,
use the following commands according to the purpose.

```shell
# Create a new project from the `develop` branch (unstable).
sbt new lerna-stack/lerna.g8 --branch develop

# Create a new project from the `v2020.12.0` tag (stable, may not be the latest).
sbt new lerna-stack/lerna.g8 --tag v2020.12.0
```

## Parameters

You can change the below properties to fit your purpose.

| name           | description                          |
| ---            | ---                                  |
| `name`         | A project name to be created         |

### Why many parameters (such as `package`) are not available?

We want to maintain the containing template project as compilable.
Gitter8's template string processing is powerful,
but it will be hard to maintain the template project as compilable.

## Versioning Strategy
Since lerna.g8 provides a combination of third partie's libraries (like a BOM),
we use [Calendar Versioning](https://calver.org/) `YYYY.MM.MICRO` rather than [Semantic Versioning](https://semver.org/).

### Branches
- `main` (default, stable, the latest)
- `develop` (unstable)

### Tags
Tag is useful to use a specific stable version.  
You can check all releases on [Releases · lerna-stack/lerna.g8](https://github.com/lerna-stack/lerna.g8/tags).

## Template license
Written in 2020 by TIS Inc.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/

## For contributors

This `g8` template uses [src-layout](http://www.foundweekends.org/giter8/template.html#src+layout) style.
The directory [src/main/g8](src/main/g8) is a `sbt` project to be used as the template.

If you want to change something about the template,
you can open `src/main/g8` as an *sbt* project in your favorite editor.
It will be recognized as a general *sbt* project.

## Changelog

You can see all the notable changes in [CHANGELOG](CHANGELOG.md).

## How to test the template

Run `sbt test`.
For more details, please refer the [Giter8 Document](http://www.foundweekends.org/giter8/Combined+Pages.html#Using+the+Giter8Plugin).
