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

Copyright © 2010, Curtis McEnroe <curtis@cmcenroe.me>

Permission to use, copy, modify, and/or distribute this software for any
purpose with or without fee is hereby granted, provided that the above
copyright notice and this permission notice appear in all copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
