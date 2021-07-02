# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## Unreleased
### Changed

#### Dependency updates
- Update *Scala* to 2.13.6
- Add *akka-entity-replication* 1.0.0+157-482a23b1-SNAPSHOT
- Update *lerna-app-library* to 2.0.0-80f86b49-SNAPSHOT
- Update *scalatest* to 3.1.4
- Update *akka* to 2.6.12
- Update *akka-http* to 10.2.4
- Add *akka-kryo-serialization-typed* 2.1.0
- Remove the direct dependency *akka-kryo-serialization*
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

## 1.x
- Initial release