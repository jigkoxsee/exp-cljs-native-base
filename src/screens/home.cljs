(ns screens.home
    (:require [reagent.core :as r :refer [atom]]
              [re-frame.core :refer [subscribe dispatch dispatch-sync]]
              [cljs-exponent.reagent :refer [text view image touchable-highlight] :as rn]))


(def playground (r/atom {:text "atom"}))

(defn screen [children]
  [view {:style {:flex-direction "column" :margin 40 :align-items "center"}}
     [image {:source (js/require "./assets/images/cljs.png")
             :style {:width 200
                     :height 200}}]
     children])
     

