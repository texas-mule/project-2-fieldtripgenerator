# Project 2: Field Trip Generator Workflow Protocols

## Repository Management

- Each version branch of the project will be branched into team branches designated by letters.

> EX: 0.0.1-a, 0.0.1-b, 0.0.1-c

  - Each team branch will be further branched into individual work branches to isolate bugs and prevent commit conflicts. This is denoted by appending a name preceded by an underscore to the parent branch name
  
  > EX: 0.0.1-a_brandon, 0.0.1-a_devkala

  - Individual-branches will be merged into their shared team-branch for integration

    - If there are integration bugs, code should be modified through the individual branches, and re-merged into the team-branch.

- Team-branches will be merged into the version branch for integration
  - If there are integration bugs, code should be modified through the individual branches, remerged into the team-branch, retested in the team-branch, and then remerged into the version branch.

- Version branches will be merged into the master branch once team-integration testing is complete.

- Branch-Naming Schema:
  - \<Release Version>.\<Sub-Version>.\<Development Stage>\[-\<Team>\[_\<Team member>]]
    - Elements with < > are required within their scope
    - Elements with [ ] are optional within their scope
    > EX: 0.0.1, 0.0.1-a, 0.0.1-a_brandon

### Version/Team Branches:
- 0.0.1 : SpringBoot Applications
  - 0.0.1-a : Events App
  - 0.0.1-b : Food App
  - 0.0.1-c : Transportation App
- 0.0.2 : Mule
  - 0.0.2-a : Integration of SpringBoot Apps
  - 0.0.2-b : Special Connector Configuration
- 0.1.0 : Prototype #1 (Class Demo)

## GitMaster

- All merges will be overseen by a GitMaster, who will be responsible for looking over code before the merges and maintaining the integrity of the repository.

- GitMaster will also be running the build/test servers and will be responsible for integration testing, working with teams to establish guidelines and goals for testing.

- GitMaster will also be able to work with the individuals/teams to help with implementation/design/integration/testing





  

