# future-examples

[`Future`](https://twitter.github.io/util/docs/com/twitter/util/Future.html)
examples.

## Compilation

    sbt compile

## Examples

    $ sbt 'run -threads 1 -items 4'
    [...]
    [info] Running com.nkouevda.future.Main -threads 1 -items 4
    1523830731136: run-main-0: scheduling 0
    1523830731140: pool-6-thread-1: sleeping
    1523830731142: run-main-0: scheduling 1
    1523830731142: run-main-0: scheduling 2
    1523830731142: run-main-0: scheduling 3
    1523830731142: run-main-0: awaiting
    1523830732142: pool-6-thread-1: finished sleeping
    1523830732143: pool-6-thread-1: sleeping
    1523830733148: pool-6-thread-1: finished sleeping
    1523830733148: pool-6-thread-1: sleeping
    1523830734153: pool-6-thread-1: finished sleeping
    1523830734153: pool-6-thread-1: sleeping
    1523830735158: pool-6-thread-1: finished sleeping
    1523830735159: run-main-0: finished awaiting
    [success] Total time: 5 s, completed Apr 15, 2018 3:18:55 PM

    $ sbt 'run -threads 4 -items 4'
    [...]
    [info] Running com.nkouevda.future.Main -threads 4 -items 4
    1523830741602: run-main-0: scheduling 0
    1523830741606: pool-6-thread-1: sleeping
    1523830741608: run-main-0: scheduling 1
    1523830741608: pool-6-thread-2: sleeping
    1523830741608: run-main-0: scheduling 2
    1523830741609: run-main-0: scheduling 3
    1523830741609: pool-6-thread-3: sleeping
    1523830741609: run-main-0: awaiting
    1523830741609: pool-6-thread-4: sleeping
    1523830742609: pool-6-thread-2: finished sleeping
    1523830742609: pool-6-thread-4: finished sleeping
    1523830742609: pool-6-thread-3: finished sleeping
    1523830742609: pool-6-thread-1: finished sleeping
    1523830742611: run-main-0: finished awaiting
    [success] Total time: 2 s, completed Apr 15, 2018 3:19:02 PM

## License

[MIT License](LICENSE.txt)
