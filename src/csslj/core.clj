(ns csslj.core)

(defn- render-ele [ele]
  (->> ele (map name) (interpose " ") (apply str)))

(defn- render-attrs [attrs]
  (apply str
         (sort
          (for [[attr value] attrs]
            (str (name attr) ": " value ";\n")))))

(defn css
  "Takes any amount of vectors of CSS elements and renders them as CSS"
  ([vec]
     (let [ele (render-ele (drop-last vec))
           attrs (render-attrs (last vec))]
       (str ele " {\n" attrs "}")))
  ([vec & more]
     (->> (map css (cons vec more)) (interpose "\n") (apply str))))
