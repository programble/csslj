# CSSLJ

CSSLJ is a library for representing CSS in Clojure in the same style
as [Hiccup](http://github.com/weavejester/hiccup).

## Syntax

    user=>(use 'csslj.core)
    nil
    user=>(css [:h1.header {:color "white" :padding "0px" :font-size "16px"}])
    "h1.header { color: white; padding: 0px; font-size: 16px; }"
    
## License

FIXME: write
