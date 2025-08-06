import React, { useEffect, useState } from 'react';
import {
  SafeAreaView,
  StyleSheet,
  Button,
  ActivityIndicator,
} from 'react-native';
import TrackPlayer from 'react-native-track-player';
import { setupPlayer, addTracks } from './trackPlayerServices';

function HeaderButton() {
  let BoutonText = "Play";
  let bool = false;
  const [isPlayerReady, setIsPlayerReady] = useState(false);
const [isPlayingMusic, setIsPlayingMusic] = useState(false);
  useEffect(() => {
    async function setup() {
      let isSetup = await setupPlayer();

      const queue = await TrackPlayer.getQueue();
      if(isSetup && queue.length <= 0) {
        await addTracks();
      }

      setIsPlayerReady(isSetup);
    }

    setup();
  }, [bool]);


  const togglePlayback = async () => {
    if (isPlayingMusic) {
      await TrackPlayer.pause();
    } else {
      await TrackPlayer.play();
    }
    setIsPlayingMusic(!isPlayingMusic);
  };

  if(!isPlayerReady) {
    return (
      <SafeAreaView style={styles.container}>
        <ActivityIndicator size="large" color="#bbb"/>
      </SafeAreaView>
    );
  }

  return (
    <SafeAreaView style={styles.container}>
      <Button title={isPlayingMusic ? "Pause" : "Play" } color="black" onPress={() => togglePlayback()}/>
    </SafeAreaView>
  )
}

const styles = StyleSheet.create({
  container: {
    padding: 20,
    backgroundColor: '#ff0000',
    borderRadius:25,
  },
});

export default HeaderButton;