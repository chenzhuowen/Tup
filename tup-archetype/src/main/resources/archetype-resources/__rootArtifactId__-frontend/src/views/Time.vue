<template>
  <div>
    <p>当前时间：{{currentTimeStamp}}</p>
    <p>utc时间：{{utcTimeStamp}}</p>
    <button @click="queryTime">查询时间</button>
  </div>
</template>

<script>
import axios from "axios";
import { queryCurrentTimeStamp, queryUtcTimeStamp } from "@api/time";

export default {
  data() {
    return {
      currentTimeStamp: "",
      utcTimeStamp: ""
    };
  },
  methods: {
    queryTime() {
      axios
        .all([queryCurrentTimeStamp(), queryUtcTimeStamp()])
        .then(
          axios.spread((response1, response2) => {
            this.currentTimeStamp = response1.data;
            this.utcTimeStamp = response2.data;
          })
        )
        .catch(
          axios.spread((error1, error2) => {
            console.log(error1);
            console.log(error2);
          })
        );
    }
  }
};
</script>



