# CSSLJ

CSSLJ is a library for representing CSS in Clojure in the same style
as [Hiccup](http://github.com/weavejester/hiccup).

## Syntax

    user=> (println (css
           [:div#body {:background-color "#FFFFFF" :color "#000000"}]
           [:span.h {:color "#FFFF00"}]
           [:h1.header {:font-size "22px" :color "#FF0000"}]
           [:h1 :a {:text-decoration "none"}]))
    div#body {
    background-color: #FFFFFF;
    color: #000000;
    }
    span.h {
    color: #FFFF00;
    }
    h1.header {
    color: #FF0000;
    font-size: 22px;
    }
    h1 a {
    text-decoration: none;
    }
    nil
    
## License

FIXME: write
