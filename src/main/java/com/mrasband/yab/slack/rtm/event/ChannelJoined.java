package com.mrasband.yab.slack.rtm.event;

import com.mrasband.yab.slack.api.model.core.Channel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * You, as in the bot, joined a channel.
 *
 * @author matt.rasband
 *
 * @see <a href="https://api.slack.com/events/channel_joined">channel_joined</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelJoined extends AbstractEvent {
    private Channel channel;
}
