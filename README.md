# Version Warning

A spigot plugin to warn users about unsupported Minecraft versions.

## Setup

```yaml
warning-period: 12000 
preferred-version: "1.19.3"
bad-versions:
  - 760
  - 759
  - 758
  - 757
banned-versions:
  756: "1.17.1 is unsupported for technical reasons. To login, please switch to one of the following Minecraft versions:\n\n<#66b366><bold>1.19.3</bold> (recommended)\n<#9f9f9f><bold>1.19.2</bold> (not recomended)\n<#9f9f9f><bold>1.19.1</bold> (not recomended)\n<#ff9f9f><bold>1.18.2</bold> (not recommended, degraded experience)"
  754: "1.16.4 is unsupported for technical reasons. To login, please switch to one of the following Minecraft versions:\n\n<#66b366><bold>1.19.3</bold> (recommended)\n<#9f9f9f><bold>1.19.2</bold> (not recomended)\n<#9f9f9f><bold>1.19.1</bold> (not recomended)\n<#ff9f9f><bold>1.18.2</bold> (not recommended, degraded experience)"
```

Counterintuitively, you should REMOVE the viaversion blacklist for any version that you want to ban completely with a custom message. Otherwise, the custom kick message won't be shown.

## License

Licensed under GPLv3

Copyright (c) 2021 lordpipe

### Contributing

By making a contribution to this repository, I certify that:

* (a) The contribution was created in whole or in part by me and I have the right to submit it under the open source license indicated in the file; or
* (b) The contribution is based upon previous work that, to the best of my knowledge, is covered under an appropriate open source license and I have the right under that license to submit that work with modifications, whether created in whole or in part by me, under the same open source license (unless I am permitted to submit under a different license), as indicated in the file; or
* (c) The contribution was provided directly to me by some other person who certified (a), (b) or (c) and I have not modified it.
* I understand and agree that this project and the contribution are public and that a record of the contribution (including all personal information I submit with it, including my sign-off) is maintained indefinitely and may be redistributed consistent with this project or the open source license(s) involved.
