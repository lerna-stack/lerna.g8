# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## Unreleased

### Dependency Updates
- Update *lerna-app-library* to 3.0.0-6-ca3f2b2b-SNAPSHOT from 3.0.0
- Update *akka-entity-replication* to 2.0.0+280-0352e28d-SNAPSHOT from 2.0.0
- Update *akka* to 2.6.17 from 2.6.12  
  *akka-entity-replication* recommends we use the same version of Akka.


## [v2021.10.0] - 2021-10-22
[v2021.10.0]: https://github.com/lerna-stack/lerna.g8/compare/v2021.7.0...v2021.10.0

### Changed
- SpecAssertions.expect handles only single assertion.
  The multiple assertions will not be supported.

### Dependency Updates
- Update *lerna-app-library* to 3.0.0 from 2.0.0
- Update *wiremock-jre8* to 2.30.1 from 2.27.2  
  It would be great to use the same version that *lerna-app-library* uses
  since it makes us easy to maintain binary compatibility.


## [v2021.7.0] - 2021-7-16
[v2021.7.0]: https://github.com/lerna-stack/lerna.g8/compare/v2020.12.0...v2021.7.0
### Changed
- `StandardSpec` uses *should.matchers* instead of *must.matchers*  
  Since the `ScalaTestWithActorTestKit` uses *should.matchers*,
  the change makes us easy to use both `StandardSpec` and`ScalaTestWithActorTestKit` at the same time.

#### Dependency updates
- Update *Scala* to 2.13.6
- Add *akka-entity-replication* 2.0.0
- Update *lerna-app-library* to 2.0.0
- Update *scalatest* to 3.1.4
- Update *akka* to 2.6.12
- Update *akka-http* to 10.2.4
- Remove *akka-kryo-serialization*  
  Use *akka-serialization-jackson* instead.  
  We'd like to use JSON as a serialization format for persistence.
- Add *akka-serialization-jackson* 2.6.12  
  The version is the same as other Akka modules.
- Add *jackson* modules (the version is 2.12.3) as direct dependencies  
  It would be great that all *jackson* modules should be the same version.
- Add *akka-projection-eventsourced* 1.1.0
- Add *akka-projection-slick* 1.1.0
- Update *slick* to 3.3.3
- Update *sbt-wartremover* to 2.4.13
- Update *sbt-scoverage* to 1.8.2

#### Use Akka Typed instead of Akka Classic
- Use *akka-actor-typed* instead of *akka-actor*
- Use *akka-cluster-typed* instead of *akka-cluster*
- Use *akka-cluster-sharding-typed* instead of *akka-cluster-sharding*
- Use *akka-persistence-typed* instead of *akka-persistence*
- Remove the direct dependency *akka-slf4j*  
    We don't need to specify the dependency since we use *akka-actor-typed* instead.
- Add *akka-persistence-testkit*  
    It would be great to test `EventSourcedBehavior`s
- Use `typed.ActorSystem[T]` instead of classic `ActorSystem`  
    It is recommended to use `typed.ActorSystem` rather than classic `ActorSystem` for new projects.

## [v2020.12.0] - 2020-12-23
[v2020.12.0]: https://github.com/lerna-stack/lerna.g8/releases/tag/v2020.12.0
- Initial release